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
    public String infoMaquina() {
        return "Maquina para: " + Musculo + " | Estado: " + (Estado ? "Disponible" : "Ocupada");
    }


    
}
public static void main(String[] args) {
        // Arreglo bidimensional nativo de 2x2
        Maquina[][] maquinas = new Maquina[2][2];

        // Inicializar manualmente
        maquinas[0][0] = new Maquina("Pecho", true);
        maquinas[0][1] = new Maquina("Espalda", false);
        maquinas[1][0] = new Maquina("Pierna", true);
        maquinas[1][1] = new Maquina("Bíceps", false);

        // Mostrar la información
        for (int i = 0; i < maquinas.length; i++) {
            for (int j = 0; j < maquinas[i].length; j++) {
                System.out.println("Máquina [" + i + "][" + j + "]: " + maquinas[i][j].infoMaquina());
            }
        }
}
