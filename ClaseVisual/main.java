package ClaseVisual;

import java.util.Scanner;
import controlador.controladorgimnasio;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        controladorgimnasio controller = new controladorgimnasio();

        while (true) {
            System.out.println("\n=== Menu Gimnasio ===");
            System.out.println("1. Obtener el género que puede ingresar al baño");
            System.out.println("2. Obtener la disponibilidad del baño");
            System.out.println("3. Obtener el grosor de la barra");
            System.out.println("4. Establecer el peso de la barra");
            System.out.println("5. Obtener el estado del espejo limpio/sucio");
            System.out.println("6. Obtener el tamaño del espejo");
            System.out.println("9. Mostrar animales en la jaula");
            System.out.println("10. Limpiar jaula");
            System.out.println("0. Salir");

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Este método en tu controlador requiere un boolean como parámetro
                    System.out.print("Ingrese true si es masculino, false si es femenino: ");
                    boolean genero = scanner.nextBoolean();
                    System.out.println("Resultado: " + controller.ObtenerGenero(genero));
                    break;
                case 2:
                    System.out.println("Disponibilidad: " + controller.getDisponibilidad());
                    break;
                case 3:
                    System.out.print("Ingrese el grosor: ");
                    double grosor = scanner.nextDouble();
                    System.out.println("Grosor de la barra: " + controller.ObtenerGrozor(grosor));
                    break;
                case 4:
                    System.out.println("Ingrese el peso de la barra:");
                    int peso = scanner.nextInt();
                    controller.EstablecePesor(peso);
                    break;
                case 5:
                    System.out.print("Ingrese true si el espejo está limpio, false si está sucio: ");
                    boolean estado = scanner.nextBoolean();
                    System.out.println("Estado del espejo: " + controller.EstadoBaño(estado));
                    break;
                case 6:
                    System.out.print("Ingrese el tamaño del espejo: ");
                    double tamaño = scanner.nextDouble();
                    System.out.println("Tamaño del espejo: " + controller.elTamaño(tamaño));
                    break;
                case 9:
                    System.out.println("Animales en la jaula: (función pendiente)");
                    break;
                case 10:
                    controller.limpiarSalon();
                    System.out.println("Jaula limpiada.");
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}



