package controlador;
import ClasesModelo.*;
import java.util.Scanner;


public class controladorgimnasio {
    Salon salon;

    Scanner scanner = new Scanner(System.in); 
    
    controladorgimnasio(){
        }
    
public void ObtenerGenero(boolean Genero){
        this.Genero = Genero; 
}

public void ObtenerDisponibilidad(boolean Disponibilidad){
        this.Disponibilidad = Disponibilidad;
}
}