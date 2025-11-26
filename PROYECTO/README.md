# Resumen del proyecto para gestionar pedidos.

* **Clases Principales:** `Cliente`, `Producto` (Abstracta), `ProductoFisico`, `ProductoDigital`, y `Pedido`.

* **Conceptos Clave:** **Herencia** (`ProductoFisico`/`ProductoDigital` extienden `Producto`) y **Polimorfismo** (diferente cálculo de precio final). 


* **Cálculo de Precios:**
    * **Físico:** Precio base + Coste de envío.
    * **Digital:** Precio base + 21% de IVA.
* **Funcionalidad:** Crea clientes, agrega productos variados a un pedido, y calcula el total. 

# Ejecuta la clase Main
java PROYECTO.Main

# Salidad de ejecución
SISTEMA DE GESTIÓN DE PEDIDOS 
Clientes creados correctamente
Productos creados correctamente

 PROCESANDO PEDIDO 1 
Producto agregado: Teclado Mecánico
Producto agregado: Software Antivirus
Producto agregado: eBook Programación Java

PROCESANDO PEDIDO 2
Producto agregado: Monitor 24 pulgadas
Producto agregado: Ratón Inalámbrico
Producto agregado: Curso Online Python

=== RESUMEN DEL PEDIDO ===
Fecha: 2025-01-15
Cliente: Ana Garcia - Email: ana.garcia@email.com - Dirección: Calle Mayor 123, Cadiz

Productos en el pedido:
1. Teclado Mecánico - Precio base: 45.99€ - Coste envío: 4.99€ - Total: 50.98€
2. Software Antivirus - Precio base: 49.99€ - Tamaño: 250.0MB - Licencia: Licencia anual - Total con IVA: 60.49€
3. eBook Programación Java - Precio base: 19.99€ - Tamaño: 15.0MB - Licencia: Licencia perpetua - Total con IVA: 24.19€

TOTAL DEL PEDIDO: 135.66€
==========================

=== RESUMEN DEL PEDIDO ===
Fecha: 2025-01-16
Cliente: Carlos Lopez - Email: carlos.lopez@email.com - Dirección: Avenida del Mar 45, Cadiz

Productos en el pedido:
1. Monitor 24 pulgadas - Precio base: 189.99€ - Coste envío: 12.5€ - Total: 202.49€
2. Ratón Inalámbrico - Precio base: 25.5€ - Coste envío: 3.99€ - Total: 29.49€
3. Curso Online Python - Precio base: 89.99€ - Tamaño: 0.0MB - Licencia: Acceso 1 año - Total con IVA: 108.89€

TOTAL DEL PEDIDO: 340.87€
==========================

 INFORMACIÓN ADICIONAL 
Total pedido 1: 135.66€
Total pedido 2: 340.87€
Número de productos en pedido 1: 3
Número de productos en pedido 2: 3

=== SISTEMA FINALIZADO ===