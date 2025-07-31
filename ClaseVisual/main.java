package ClaseVisual;

import java.util.Scanner;

import controlador.controladorgimnasio;

public class main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner (System.in);

        controladorgimnasio controller = new controladorgimnasio();
        while (true){
             System.out.println("\n=== Menu Gimnsaio ===");

            System.out.println("1. Obetener el género que puede ingresar al baño");
            System.out.println("2. Obtener la disponibilidad del baño");
            System.out.println("3. Obtener el grozor de la barra");
            System.out.println("4. Establecer el peso de la barra")
            System.out.println("5. Obtener el estado del espejo limpio/sucio");
            System.out.println("8. Obtener el tamaño del espejo");
            System.out.println("9. mostrar animales en la jaula");
            System.out.println("10. limpiar jaula");
            System.out.println("0. salir");

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
               
                case 1:
                    System.out.print("Ingrese el nombre de la gallina: ");
                    String nombreGallinaJaula = scanner.nextLine();
                    controller.agregarGallina(nombreGallinaJaula);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del gallo: ");
                    String nombreGallo = scanner.nextLine();
                    System.out.print("Ingrese la raza del gallo: ");
                    String razaGallo = scanner.nextLine();
                    controller.agregarGallo(nombreGallo, razaGallo);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del pollito: ");
                    String nombrePollitoJaula = scanner.nextLine();
                    controller.agregarPollito(nombrePollitoJaula);
                    break;
                case 4:
                    controller.sacarTodosAnimales();
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del animal a sacar: ");
                    String nombreAnimalSacar = scanner.nextLine();
                    controller.sacarAnimal(nombreAnimalSacar);
                    break;
                case 6:
                    controller.mostrarAnimalesEnJaula();
                    break;
                case 7:
                    controller.limpiarJaula();
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}


}
