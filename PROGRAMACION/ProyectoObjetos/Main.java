package PROGRAMACION.ProyectoObjetos;

public class Main {
    public static void main(String[] args) {
        // Crear armas
        Arma pistola = new Arma(10, 40, 1.5, 10);
        Arma escopeta = new Arma(8, 60, 3.0, 8);
        Arma rifle = new Arma(15, 80, 4.0, 15);
        
        // Crear personajes
        Personaje heroe = new Personaje("Héroe", 5, 5, 100, 75.0, 1.80, "heroe.png", pistola, true);
        
        // Crear enemigos
        Enemigo zombie = new Enemigo("Zombie", 3, 3, 80, 60.0, 1.75, "zombie.png", escopeta, true, 2, false, true);
        Enemigo jefe = new Enemigo("Jefe Final", 10, 10, 200, 100.0, 2.50, "jefe.png", rifle, true, 5, true, false);
        
        // Probar funcionalidades
        System.out.println("=== INICIO DEL JUEGO ===");
        System.out.println("Héroe: " + heroe.getNombre() + " - Vida: " + heroe.getPuntosVida());
        System.out.println("Zombie: " + zombie.getNombre() + " - Vida: " + zombie.getPuntosVida());
        System.out.println("Jefe: " + jefe.getNombre() + " - Vida: " + jefe.getPuntosVida());
        
        System.out.println("\n=== PRUEBA DE MOVIMIENTO ===");
        System.out.println("Posición inicial Héroe: (" + heroe.getPosx() + ", " + heroe.getPosy() + ")");
        heroe.moverse(Personaje.NORTE);
        System.out.println("Posición después de mover al NORTE: (" + heroe.getPosx() + ", " + heroe.getPosy() + ")");
        
        System.out.println("\n=== PRUEBA DE DETECCIÓN ===");
        boolean detectado = zombie.detectar(heroe);
        System.out.println("¿Zombie detecta al Héroe? " + detectado);
        
        System.out.println("\n=== PRUEBA DE DISPARO ===");
        boolean acierto = heroe.disparar(zombie);
        System.out.println("¿Héroe acertó a Zombie? " + acierto);
        System.out.println("Vida de Zombie después del disparo: " + zombie.getPuntosVida());
        System.out.println("¿Modo infernal activado en Zombie? " + zombie.isModoInfernal());
        
        System.out.println("\n=== PRUEBA DE TELETRANSPORTE ===");
        boolean teleport = zombie.teletransportarse(15, 15);
        System.out.println("¿Zombie se teletransportó? " + teleport);
        System.out.println("Nueva posición Zombie: (" + zombie.getPosx() + ", " + zombie.getPosy() + ")");
        
        System.out.println("\n=== PRUEBA DE CAMBIO DE ARMA ===");
        boolean cambioExitoso = heroe.cambiarArma(rifle);
        System.out.println("¿Héroe pudo cambiar a rifle? " + cambioExitoso);
        
        // Probar con arma que no cumple requisitos
        Arma armaPesada = new Arma(20, 90, 20.0, 20); // Peso > 20% del peso del héroe
        cambioExitoso = heroe.cambiarArma(armaPesada);
        System.out.println("¿Héroe pudo cambiar a arma pesada? " + cambioExitoso);
        
        System.out.println("\n=== PRUEBA DE RECARGA ===");
        // Gastar munición primero
        heroe.getArma().setMunicion(2);
        System.out.println("Munición antes de recargar: " + heroe.getArma().getMunicion());
        boolean recargado = heroe.getArma().recargar();
        System.out.println("¿Se pudo recargar? " + recargado);
        System.out.println("Munición después de recargar: " + heroe.getArma().getMunicion());
        
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Héroe - Vida: " + heroe.getPuntosVida() + ", Posición: (" + heroe.getPosx() + ", " + heroe.getPosy() + ")");
        System.out.println("Zombie - Vida: " + zombie.getPuntosVida() + ", Posición: (" + zombie.getPosx() + ", " + zombie.getPosy() + ")");
        System.out.println("Jefe - Vida: " + jefe.getPuntosVida() + ", Posición: (" + jefe.getPosx() + ", " + jefe.getPosy() + ")");
    }
}