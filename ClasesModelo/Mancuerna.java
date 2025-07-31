public class Mancuerna {
    // Atributos
    private int peso;
    private String estado;

    // ConstructorPorDefecto
    public Mancuerna() {
        this.peso = 0;
        this.estado = "Bueno"; // Valor por defecto
    }

    // ConstructorConParametro
    public Mancuerna(int peso, String estado) {
        this.peso = peso;
        this.estado = estado;
    }

    
    public int tomarPeso(){
        return peso;
    }

    public String TomarEstado(){
        return estado;
    }

    
    public void EstablecerPeso(int peso){
        this.peso = peso;
    }

    public void EstablecerEstado(String estado){
        this.estado = estado;
    }

    // Método para hacer bíceps
    public void hacerBicep() {
        if (estado.equalsIgnoreCase("Bueno")) {
            System.out.println(" Haciendo ejercicio de bíceps con " + peso + " kg.");
        } else {
            System.out.println("No se recomienda usar esta mancuerna. Estado: " + estado);
        }
    }

    //equalsIgnoreCas sirve para poder hacer que si la respuesta del usuario es BUENO,bueno o Bueno, siempre sea correcta

    // Método para hacer hombros
    public void hacerHombro() {
        if (estado.equalsIgnoreCase("Bueno")) {
            System.out.println("Haciendo ejercicio de hombros con " + peso + " kg.");
        } else {
            System.out.println("Esta mancuerna no está en buen estado para usar. Estado: " + estado);
        }
    }
}

