public class Maquina {
    // Atributos
    private String Musculo;
    private boolean Estado;

    // Constructores
    public Maquina() {
        this.Musculo = "";
        this.Estado = true; // Por defecto, la máquina está disponible
    }

    public Maquina(String musculo, boolean estado) {
        this.Musculo = musculo;
        this.Estado = estado;
    }

    // Métodos getters y setters
    public String getMusculo() {
        return Musculo;
    }

    public void setMusculo(String musculo) {
        this.Musculo = musculo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        this.Estado = estado;
    }

    // Método para cambiar el estado de la máquina
    public void cambiarEstado() {
        this.Estado = !this.Estado;
    }

    // Método para mostrar información de la máquina
    public String toString() {
        return "Maquina para: " + Musculo + " | Estado: " + (Estado ? "Disponible" : "Ocupada");
    }


    
}
