public class Salon {
    // Atributos
    private String nombre;
    private boolean disponible;
    private double tamaño;
    private String Casillero;
    
    

    // Constructores
    public Salon() {
        this.nombre = "";
        this.disponible = true;
        this.tamaño = 0.0;
    }

    public Salon(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.tamaño = 0.0;
        
    }

    public Salon(String nombre, boolean disponible, double tamaño) {
        this.nombre = nombre;
        this.disponible = disponible;
        this.tamaño = tamaño;
        
    }

    // Métodos

    public String getNombre() {
        return nombre;
    }
    public String getTamaño() {
        return tamaño + " m²";
    }

    public void limpiar() {
        System.out.println("El salón " + nombre + " ha sido limpiado.");
    }

    public boolean cambiarDisponibilidad() {
        disponible = !disponible;
        System.out.println("La disponibilidad del salón " + nombre + " ahora es: " + (disponible ? "Disponible" : "No disponible"));
    }

    public void mostrarTamaño() {
        System.out.println("El tamaño del salón " + nombre + " es de " + tamaño + " m².");
    }

    public void setNombre(String nombreSalon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }

    public void setDisponibilidad(boolean disponibilidadSalon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDisponibilidad'");
    }

    public void setTamaño(double tamañoSalon) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTamaño'");
    }

    <>  
}


