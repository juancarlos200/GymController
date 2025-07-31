package controlador;
import ClasesModelo.*;
import java.util.Scanner;

public class controladorgimnasio {
    Salon salon;

    Scanner scanner = new Scanner(System.in); 
    
    controladorgimnasio(){
        }

// Baño
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