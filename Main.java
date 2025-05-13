import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // crear clientes
        Cliente clientes = new Cliente("1234567890", "Juan perez");

        // crear fotos
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        Foto[] fotos = { foto1, foto2 };

        // crear productos
        Impresion impresion = new Impresion(101, "Colo", fotos);
        Camara camara = new Camara(202, "Canon", "EOS 2000D");

        // crear arreglo de productos
        Producto[] productos = { impresion, camara };

        // crear pedido
        pedido pedido = new pedido(cliente, productos, new Date(), 987654321);

        // Moatrar pedido
        pedido.mostrarpedido();

        // Mostrar fotos de la impresion
        impresion.mostrarFotos();
    }
}