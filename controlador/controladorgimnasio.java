package controlador;
import ClasesModelo.*;
import java.util.Scanner;

public class controladorgimnasio {
    Salon salon;

    Scanner scanner = new Scanner(System.in); 
    
    controladorgimnasio(){
        this.salon = new Salon();
    }
    public boolean limpiarSalon(){
        salon.limpiar();
        return true;

    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }
    public Salon getSalon() {
        return salon;
    }

    public String ObtenerNombre(String Nombre){
        return Nombre;
        
    }

    public double ObtenerTamaño(double Tamaño){
        return Tamaño;
    }

    public boolean getDisponibilidad(boolean Disponibilidad){
        return Disponibilidad;
    }

    Maquina maquina;

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public String ObtenerNombreMaquina(String NombreMaquina){
        return NombreMaquina;
    }

    public String ObtenerMusculo(String Musculo){
        return Musculo;
    }

    public boolean ObtenerDisponibilidadMaquina(Boolean ObtenerDisponibilidadMaquina){
        return ObtenerDisponibilidadMaquina;
    }

    public String infoMaquina(String infoMaquina){
        return infoMaquina;
    }

    public void getEstadoMaquina(boolean EstadoMaquina){
        this.EstadoMaquina = EstadoMaquina; 
    }
    public boolean getEstadoMaquina() {
        return EstadoMaquina;
    }
    private boolean EstadoMaquina;

    Mancuerna mancuerna;

    public void setMancuerna(Mancuerna mancuerna) {
        this.mancuerna = mancuerna;
    }
    public Mancuerna getMancuerna() {
        return mancuerna;
    }

    public String ObtenerEstadoMancuerna(String EstadoMancuerna){
        return EstadoMancuerna;
    }

    public double ObtenerPesoMancuerna(double PesoMancuerna){
        return PesoMancuerna;
    }

    
public void ObtenerGenero(boolean Genero){
        this.Genero = Genero; 
}

public void ObtenerDisponibilidad(boolean Disponibilidad){
        this.Disponibilidad = Disponibilidad;
}
// Barra
public double ObtenerGrozor() {
        return Grozor;}

public void EstablecePesor(int peso){

        this.Peso = peso; }
// Espejo
public boolean EstadoBaño(){
        return Limpieza;
    }
public double elTamaño(){
        return Tamaño;
    }

}