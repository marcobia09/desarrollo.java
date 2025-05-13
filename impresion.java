public class Impresion extends Producto {
    private String color;
    private foto[] fotos;

    public Impresion (int numero, String color, Foto[] fotos) {
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