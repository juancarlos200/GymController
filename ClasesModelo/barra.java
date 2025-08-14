<<<<<<< HEAD
import java.util.ArrayList;

public class barra {
=======
public class Barra {
>>>>>>> 07595d10e3fd134c3a2d0dfd5dca4c2070a3edfb
    // Atributos
    private int Peso;
    private double Grozor;
    private ArrayList<Disco> discos;

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

    public String hacerEspalda(){
       return "Estas haciendo Espalda en una barra de" + Peso + "kg y" + Grozor + "cm de grozor";
    }

    public void agregarPeso(Disco pesoExtra) {
        discos.add(pesoExtra);
    }


}
