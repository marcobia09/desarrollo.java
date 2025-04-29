
 Explicación de conceptos

Herencia y Polimorfismo
Producto es la superclase de Camara e Impresion.
Podemos tratar productos de manera uniforme en el arreglo Producto[] gracias al polimorfismo: cada objeto conserva su comportamiento y clase específica.

Composición y Agregación
Composición: Impresion contiene un arreglo de Foto. Si la impresión se elimina, sus fotos también.
Agregación: Pedido agrega productos. Los productos pueden existir sin un pedido.
Pedido tiene un cliente (puede verse como agregación o composición según el contexto, aquí lo planteamos como composición porque depende directamente del cliente al hacerse el pedido


public class Cliente {
    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}


public class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}


public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public void mostrarFotos() {
        for (Foto foto : fotos) {
            foto.print();
        }
    }
}


public class Camara extends Producto {
    private String marca;
    private String modelo;

    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }
}


public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Mostrando foto: " + fichero);
    }
}


import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getCedula() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("Producto N°: " + p.getNumero() + " - " + p.getClass().getSimpleName());
        }
    }
}


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("1234567890", "Juan Pérez");

        // Crear fotos
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        Foto[] fotos = { foto1, foto2 };

        // Crear productos
        Impresion impresion = new Impresion(101, "Color", fotos);
        Camara camara = new Camara(202, "Canon", "EOS 2000D");

        // Crear arreglo de productos
        Producto[] productos = { impresion, camara };

        // Crear pedido
        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);

        // Mostrar pedido
        pedido.mostrarPedido();

        // Mostrar fotos de la impresión
        impresion.mostrarFotos();
    }
}


