package Gym2;

public class Baño {
    // Atributos
    private boolean genero;
    private boolean Disponibilidad;

    // ConsutrctoresPorDefecto
    Baño() {
        this.genero = true;
        this.Disponibilidad = true;

    }

    // ConstructorConParametro

    Baño(String Genero, boolean Disponibilidad) {
        this.genero = Genero;
        this.Disponibilidad = Disponibilidad;

    }

    // MetodoObtenerGenero

    public String elGenero(){
        return genero;
    }

    //MetodoDeDisponibilidad

    public boolean laDisponibilidad(){
        return disponibilidad;
    }


    //EditorDeGenero

    public void ObtenerGenero(boolean Genero){
        this.Genero = Genero;

    }

    // EditorDeDisponibilidad

    public void ObtenerDisponibilidad(boolean Disponibilidad){
        this.Disponibilidad = Disponibilidad;
    }

    //MetodoInformacionDeBaño

    public void MostrarInfoCompleta(){
        String TipoGenero = Genero ? "Masculino" : "Femenino";

        String EstadoBaño = Disponibilidad ? "Disponible" + "Ocupado";

        System.out.println("Baño" + TipoGenero + "-" + EstadoBaño);


    }


    //MetodoBañoOcupado

    public void BañoOcupado(){
        if(Disponibilidad){
            Disponibilidad = false;
            System.out.println("El Baño en este momento se encuentra ocupado");

        }else {
            System.out.println("El Baño en este momento se encuentra Disponible");
            
        }
    }

    
}
