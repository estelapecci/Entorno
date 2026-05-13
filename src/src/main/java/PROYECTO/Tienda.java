package PROYECTO;

public class Tienda {

    /**
     * Método principal: orquesta la venta completa.
     * Recibe: cliente + pedido ya preparado.
     */
    public Factura realizarVenta(Cliente cliente, Pedido pedido) {

        if (pedido == null || cliente == null) {
            throw new IllegalArgumentException("Cliente o pedido inválidos");
        }

        // 1. Calcular total bruto (precio final de cada producto)
        double totalSinDescuentos = pedido.calcularTotal();

        // 2. Calcular descuento de fidelidad
        double descuento = calcularDescuento(cliente, totalSinDescuentos);

        double totalNeto = totalSinDescuentos - descuento;

        // 3. Separar IVA total para factura
        double totalIva = calcularIVATotal(pedido, cliente);

        // 4. Separar coste de envío total
        double totalEnvio = calcularEnvioTotal(pedido, cliente);

        // 5. Generar factura
        return new Factura(cliente, pedido, totalNeto, totalIva, totalEnvio);
    }


    /**
     * Descuento según antigüedad y si es VIP.
     */
    private double calcularDescuento(Cliente c, double base) {
        double descuento = 0;

        if (c.getEsVip()) descuento += 0.10;  // 10%
        if (c.getAnosAntiguedad() >= 5) descuento += 0.05; // +5%

        return base * descuento;
    }

    /**
     * Calcula el IVA total sumando el IVA individual de cada producto digital.
     */
    private double calcularIVATotal(Pedido p, Cliente c) {
        double ivaTotal = 0;

        for (int i = 0; i < p.getProductos().size(); i++) {

            Producto prod = p.getProductos().get(i);
            int cantidad = p.getCantidades().get(i);

            if (prod instanceof ProductoDigital digital) {
                // IVA = precioFinal - precioBase
                double precioFinal = digital.calcularPrecioFinal(c.getPais());
                double iva = precioFinal - digital.getPrecioBase();
                ivaTotal += iva * cantidad;
            }
        }

        return ivaTotal;
    }


    /**
     * Calcula el coste de envío sumando el envío de cada producto físico.
     */
    private double calcularEnvioTotal(Pedido p, Cliente c) {
        double envioTotal = 0;

        for (int i = 0; i < p.getProductos().size(); i++) {

            Producto prod = p.getProductos().get(i);
            int cantidad = p.getCantidades().get(i);

            if (prod instanceof ProductoFisico fisico) {
                double envio = fisico.calcularCosteEnvio(c.getPais());
                envioTotal += envio * cantidad;
            }
        }

        return envioTotal;
    }
}
