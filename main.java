import java.util.Date;

public class main {
    public static void main(String[] args) {
        // crear clientes
        Clientes clientes = new Cliente("1234567890", "Juan perez");

        // crear fotos
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        foto[] fotos = { foto1, foto2 };

        // crear productos
        Impresion impresion = new Impresion(101, "Colo", fotos);
        Camara camara = new camara(202, "Canon", "EOS 2000D");

        // crear arreglo de productos
        Producto[] productos = { impresion, camara };

        // crear pedido
        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);

        // Moatrar pedido
        pedido.mostrarPedido();

        // Mostrar fotos de la impresion
        impresion.mostrarFotos();
    }
}