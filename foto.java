public class foto {
    private String fichero;

    public foto(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Mostrando foto: " + fichero); 
    }
}