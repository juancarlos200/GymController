package Gym2;

import Salon;

public class Main {
    public static void main(String[] args) {
        // Crear un salón con el constructor vacío
        Salon salon1 = new Salon();
        salon1.mostrarTamaño(); // Tamaño por defecto
        salon1.limpiar();
        salon1.cambiarDisponibilidad();

        System.out.println();

        // Crear un salón con nombre y disponibilidad
        Salon salon2 = new Salon("Aula 101", true);
        salon2.mostrarTamaño(); // Tamaño por defecto
        salon2.limpiar();
        salon2.cambiarDisponibilidad();

        System.out.println();

        // Crear un salón con todos los datos
        Salon salon3 = new Salon("Laboratorio 5", false, 42.5, "Laboratorio");
        salon3.mostrarTamaño();
        salon3.limpiar();
        salon3.cambiarDisponibilidad();

        System.out.println("getTamaño(): " + salon3.getTamaño());
    }
}

