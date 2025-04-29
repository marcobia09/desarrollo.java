import java.util.Date;

public class pedido {
    private cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetacredito;

    public pedido(cliente cliente, Producto[] productos, Date fecha, int numeroTarjetacredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetacredito = numeroTarjetacredito;
    }

    public void mostrarpedido() {
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto P : productos) {
            System.out.printIn("Producto N°: " + P.getNumero() + " - " + p.getClass().getSimpleName());
        }
    }
}

 