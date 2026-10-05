# Entorno

Repository with several programming exercises and projects. The project documented in this repository is **`PROGRAMACION/ProyectoObjetos`**.

## Project overview: ProyectoObjetos

A small console game model written in Java that demonstrates object-oriented programming.

| Class | Description |
|-------|-------------|
| `Arma` | A weapon with ammunition, power and weight. It can be reloaded. |
| `Personaje` | A game character with position, health and a weapon. It can move, shoot and change weapon. |
| `Enemigo` | Extends `Personaje`. Adds resurrection count, infernal mode and teleportation. It can detect characters and teleport. |
| `Main` | Test program that creates weapons, a hero and enemies and tries all the features. |

## Prerequisites

- [Git](https://git-scm.com/)
- Java Development Kit (JDK) 11 or higher. Check it with `java -version` and `javac -version`.

## Setup and run

1. Clone the repository:
```bash
   git clone https://github.com/estelapecci/Entorno.git
   cd Entorno
```
2. Compile the project from the repository root:
```bash
   javac PROGRAMACION/ProyectoObjetos/*.java
```
3. Run the program:
```bash
   java PROGRAMACION.ProyectoObjetos.Main
```

## Generate the Javadoc

From the repository root:

```bash
javadoc -d docs -encoding UTF-8 PROGRAMACION/ProyectoObjetos/*.java
```

Then open `docs/index.html` in a browser.

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) before opening a pull request.

## Author

Estela - [@estelapecci](https://github.com/estelapecci)
//estelapecci