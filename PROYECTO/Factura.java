package PROYECTO;

import java.time.LocalDate;
import java.util.List;

public class Factura {

    private String codigoFactura;
    private LocalDate fechaEmision;

    private Cliente cliente;
    private Pedido pedido;

    private double totalNeto;
    private double totalIva;
    private double totalEnvio;
    private double totalFinal;

    private static int contadorFacturas = 1;

    public Factura(Cliente cliente, Pedido pedido,
                   double totalNeto, double totalIva, double totalEnvio) {

        this.codigoFactura = "FAC-" + contadorFacturas++;
        this.fechaEmision = LocalDate.now();

        this.cliente = cliente;
        this.pedido = pedido;

        this.totalNeto = totalNeto;
        this.totalIva = totalIva;
        this.totalEnvio = totalEnvio;
        this.totalFinal = totalNeto + totalIva + totalEnvio;
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    @Override
    public String toString() {

        return  "\n===== FACTURA =====\n" +
                "Código: " + codigoFactura + "\n" +
                "Fecha: " + fechaEmision + "\n" +
                "Cliente: " + cliente.toString() + "\n\n" +
                "--- DESGLOSE ---\n" +
                "Subtotal (sin IVA ni envíos): " + totalNeto + "€\n" +
                "IVA aplicado: " + totalIva + "€\n" +
                "Coste de envío total: " + totalEnvio + "€\n\n" +
                "TOTAL A PAGAR: " + totalFinal + "€\n" +
                "===================\n";
    }
}
