
package controlador;
import ClasesModelo.Salon;
import ClasesModelo.Maquina;
import ClasesModelo.Mancuerna;
import java.util.Scanner;

public class controladorgimnasio {
    public Salon salon;
    public Maquina maquina;
    public Mancuerna mancuerna;
    public boolean Disponibilidad = true;
    public int Peso = 0;

    Scanner scanner = new Scanner(System.in); 
    
    public controladorgimnasio(){
        this.salon = new Salon();
        this.maquina = new Maquina();
        this.mancuerna = new Mancuerna();
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

    public boolean getDisponibilidad(boolean disponibilidadBaño){
        return disponibilidadBaño;
    }

    public Maquina maquina;

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

    

    public boolean ObtenerGenero(boolean generoBaño) {
        return generoBaño;
    }

  
    
    public boolean getDisponibilidad() {
        return Disponibilidad;
    }
    // Barra
    public double ObtenerGrozor(double Grozor){ 
        return Grozor;
    }


    public void EstablecePesor(int peso){
        this.Peso = peso; 
    }
    // Espejo
    public boolean EstadoBaño(boolean estadoEspejo){
        return estadoEspejo;
    }
    public double elTamaño(double Tamaño){
        return Tamaño;
    }
    public void setBarraPeso(int peso) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setBarraPeso'");
    }
    public String getBarraPeso() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBarraPeso'");
    }
    public void setPesoMancuernas(double pesoMancuernas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPesoMancuernas'");
    }
    public String getPesoMancuernas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPesoMancuernas'");
    }
    public boolean getEstadoMancuernas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstadoMancuernas'");
    }
    public void ObtenerEstadoMancuerna(boolean estadoMancuernas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ObtenerEstadoMancuerna'");
    }

}