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
            System.out.println("6. Obtener el tamaño del espejo");
            System.out.println("9. mostrar animales en la jaula");
            System.out.println("10. limpiar jaula");
            System.out.println("0. salir");

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
               
                case 1:
                
                    controller.ObtenerGenero();
                    break;
                case 2:
                    controller.ObtenerDisponibilidad()
                    break;
                case 3:
                    controller.ObtenerGrozor()
                    break;
                case 4:
                System.out.println("Ingrese el peso de la barra");
                int Peso = scanner.nextInt();
                    controller.EstablecerPeso(Peso);
                    break;
                case 5:
                    controller.EstadoEspejo()
                    break;
                case 6:
                    controller.elTamaño();
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
