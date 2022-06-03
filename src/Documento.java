public class Documento {
    public String nombre;
    public String tamaño;

    public Documento(String nombre, String tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return " Documento {" +
                "nombre='" + nombre + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
}
