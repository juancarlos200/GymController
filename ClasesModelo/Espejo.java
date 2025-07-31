public class Espejo {
    // Atributo
    private double Tamaño;
    private boolean Limpieza;

    // Constructores
    public Espejo(double Tamaño, boolean Limpieza) {
        this.Tamaño = Tamaño;
        this.Limpieza = Limpieza;
        }

    // Metodos
    
    public double elTamaño(){
        return Tamaño;
    }

    public boolean EstadoEspejo(){
        return Limpieza;
    }
}
