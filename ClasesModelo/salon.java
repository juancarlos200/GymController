public class Salon {
    // Atributos
    private String nombre;
    private boolean disponible;
    private double tamaño;
    private String casillero;

    // Arreglo nativo de Strings (nombres de casilleros)
    private String[] casilleros = { "Casillero A", "Casillero B", "Casillero C", "Casillero D" };

    // Arreglo de objetos Salon
    private Salon[] salones;

    // Constructores
    public Salon() {
        this.nombre = "";
        this.disponible = true;
        this.tamaño = 0.0;
        this.casillero = "";
        inicializarSalones();
    }

    public Salon(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.tamaño = 0.0;
        this.casillero = "";
        inicializarSalones();
    }

    public Salon(String nombre, boolean disponible, double tamaño) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.tamaño = tamaño;
        this.casillero = "";
        inicializarSalones();
    }

    // Inicializa el arreglo de objetos con 4 casilleros
    private void inicializarSalones() {
        salones = new Salon[4];
        for (int i = 0; i < 4; i++) {
            salones[i] = new Salon("Salón " + (i + 1), true, 50.0);
            salones[i].setCasillero(casilleros[i]);
        }
    }

    // Métodos GET
    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño + " m²";
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getCasillero() {
        return casillero;
    }

    public String[] getCasilleros() {
        return casilleros;
    }

    public Salon[] getSalones() {
        return salones;
    }

    // Métodos SET
    public void setNombre(String nombreSalon) {
        this.nombre = nombreSalon;
    }

    public void setDisponibilidad(boolean disponibilidadSalon) {
        this.disponible = disponibilidadSalon;
    }

    public void setTamaño(double tamañoSalon) {
        this.tamaño = tamañoSalon;
    }

    public void setCasillero(String casillero) {
        this.casillero = casillero;
    }

    // Otros métodos
    public void limpiar() {
        System.out.println("El salón " + nombre + " ha sido limpiado.");
    }

    public boolean cambiarDisponibilidad() {
        disponible = !disponible;
        System.out.println("La disponibilidad del salón " + nombre + " ahora es: " + (disponible ? "Disponible" : "No disponible"));
        return disponible;
    }

    public void mostrarTamaño() {
        System.out.println("El tamaño del salón " + nombre + " es de " + tamaño + " m².");
    }
}


