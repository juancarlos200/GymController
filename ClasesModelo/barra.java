import java.util.ArrayList;

public class barra {
    // Atributos
    private int Peso;
    private double Grozor;
    private ArrayList<Disco> discos;

    // ConstructoresPorDefecto

    public barra(){
        this.Peso = 0;
        this.Grozor = 0.0;

    }

    // ConstructorPorParametro

    public barra(int peso, double Grozor){
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

    public String hacerEspalda(){
       return "Estas haciendo Espalda en una barra de" + Peso + "kg y" + Grozor + "cm de grozor";
    }

    public void agregarPeso(Disco pesoExtra) {
        discos.add(pesoExtra);
    }


}
