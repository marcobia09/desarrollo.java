public class cliente {
    private String cedula;
    private String nombre;

    public cliente(String cedula, String nombre) {
        this.cedula = cedula; 
        this.nombre = nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public String getNombre(){
        return nombre;
    }
}