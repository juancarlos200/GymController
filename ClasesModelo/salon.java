 public class Salon {
    // Atributos
    private String nombre;
    private boolean disponible;
    private double tamaño;
    private String genero;

    // Constructores
    public Salon() {
        this.nombre = "";
        this.disponible = true;
        this.tamaño = 0.0;
        this.genero = "";
    }

    public Salon(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.tamaño = 0.0;
        this.genero = "";
    }

    public Salon(String nombre, boolean disponible, double tamaño, String genero) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.tamaño = tamaño;
        this.genero = genero;
    }

    // Métodos
    public String getTamaño() {
        return tamaño + " m²";
    }

    public void limpiar() {
        System.out.println("El salón " + nombre + " ha sido limpiado.");
    }

    public void cambiarDisponibilidad() {
        disponible = !disponible;
        System.out.println("La disponibilidad del salón " + nombre + " ahora es: " + (disponible ? "Disponible" : "No disponible"));
    }

    public void mostrarTamaño() {
        System.out.println("El tamaño del salón " + nombre + " es de " + tamaño + " m².");
    }
}


