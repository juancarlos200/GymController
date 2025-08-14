public class Barra {
    // Atributos
    private int Peso;
    private double Grozor;

    // ConstructoresPorDefecto

    public Barra(){
        this.Peso = 0;
        this.Grozor = 0.0;

    }

    // ConstructorPorParametro

    public Barra(int peso, double Grozor){
        this.Peso = peso;
        this.Grozor = Grozor;

    }

    // MetodoDeObtenerValores

    public int ObtenerPeso() {

        return Peso;

    }

    public double ObtenerGrozor() {
       
        return Grozor;

    }

    // MetodosParaModificar

    public void EstablecePesor(int peso){

        this.Peso = peso;

    }

    public void EstableceGrozor(double Grozor){

        this.Grozor = Grozor;

    }


    // ResultadoModicado

    public void hacerEspalda(){
        System.out.println("Estas haciendo Espalda en una barra de" + Peso + "kg y" + Grozor + "cm de grozor");
    }



}
