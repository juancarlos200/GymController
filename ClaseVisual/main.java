package ClaseVisual;

import java.util.Scanner;

import controlador.controladorgimnasio;

public class main {
    public main(String[]args) {
        Scanner scanner = new Scanner (System.in);

        controladorgimnasio controller = new controladorgimnasio();
        while (true){
             System.out.println("\n=== Menu Gimnsaio ===");

            System.out.println("1. Obetener el género del baño");
            System.out.println("2. Obtener la disponibilidad del baño");
            System.out.println("3. Obtener el grozor de la barra");
            System.out.println("4. Establecer el peso de la barra")
            System.out.println("5. Obtener el estado del espejo ");
            System.out.println("6. Obtener el tamaño del espejo");
            System.out.println("7. obtener nomde de salon");
            System.out.println("8. obtener tamaño de salon");
            System.out.println("9. obtener disponibilidad de salon");
            System.out.println("10. limpiar salon");
            System.out.println("11. obtener nombre de maquina");
            System.out.println("12. obtener musculo de maquina");
            System.out.println("13. obtener disponibilidad de maquina");
            System.out.println("14. cambiar estado de maquina");
            System.out.println("15. mostrar informacion de maquina");
            System.out.println("16. obtener peso de mancuernas");
            System.out.println("17. obtener el estado de la mancuernas");
            System.out.println("0. salir de gimnasio");

            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
               
                case 1:
                    System.out.print("Ingrese el género del baño (hombre/Mujer): ");
                    boolean generoBaño = scanner.nextBoolean();
                    controller.ObtenerGenero(generoBaño);
                    System.out.print("Género del baño: " + controller.ObtenerGenero(generoBaño));
                    break;
                case 2:
                    System.out.print("obtener disponibilidad del baño (libre/ocupado): ");
                    boolean disponibilidadBaño = scanner.nextBoolean();
                    controller.getDisponibilidad(disponibilidadBaño);
                    System.out.print("Disponibilidad del baño: " + controller.getDisponibilidad(disponibilidadBaño));
                    break;
                case 3:
                    System.out.print("obtener el grozor de la barra: ");
                    double grozor = scanner.nextDouble();
                    controller.ObtenerGrozor(grozor);
                    System.out.print("Grozor de la barra: " + controller.ObtenerGrozor(grozor));
                    break;
                case 4:
                    System.out.print("Ingrese el peso de la barra: ");
                    int peso = scanner.nextInt();
                    controller.setBarraPeso(peso);
                    System.out.println("10. obtener nomde de salon");
                    System.out.println("Peso de la barra establecido a: " + controller.getBarraPeso()); 
                    break;
                case 5:
                    System.out.print("obtener estado de el espejo (limpio/sucio): ");
                    boolean estadoEspejo = scanner.nextBoolean();
                    controller.EstadoBaño(estadoEspejo);
                    System.out.print("Estado del espejo: " + controller.EstadoBaño(estadoEspejo));
                    break;

                case 6:
                    System.out.print("obtener tamaño del espejo: ");
                    double tamañoEspejo = scanner.nextDouble();
                    controller.elTamaño(tamañoEspejo);
                    System.out.print("Tamaño del espejo: " + controller.elTamaño(tamañoEspejo));
                    break;
                case 7:
                    System.out.print("Ingrese el nombre del salón: ");
                    String nombreSalon = scanner.nextLine();
                    controller.salon.setNombre(nombreSalon);
                    System.out.println("Nombre del salón: " + controller.salon.getNombre());
                    break;
                case 8:
                    System.out.print("Ingrese el tamaño del salón: ");
                    double tamañoSalon = scanner.nextDouble();
                    controller.salon.setTamaño(tamañoSalon);
                    System.out.println("Tamaño del salón: " + controller.salon.getTamaño());
                    break;
                    
                case 9:
                    System.out.print("Ingrese la disponibilidad del salón (disponible/no disponible): ");
                    boolean disponibilidadSalon = scanner.nextBoolean();
                    controller.salon.setDisponibilidad(disponibilidadSalon);
                    System.out.println("Disponibilidad del salón: " + (controller.salon.cambiarDisponibilidad() ? "Disponible" : "No disponible"));
                    break;

                case 10:
                    System.out.print("Limpiar salón: ");
                    controller.salon.limpiar();
                    System.out.println("Salón limpiado.");
                    break;

                case 11:
                    System.out.print("Ingrese el nombre de la máquina: ");
                    String nombreMaquina = scanner.nextLine();
                    controller.maquina.setMusculo(nombreMaquina);
                    System.out.println("Nombre de la máquina: " + controller.maquina.getMusculo());
                    break;

                case 12:
                    System.out.print("Ingrese el músculo de la máquina: ");
                    String musculoMaquina = scanner.nextLine();
                    controller.maquina.setMusculo(musculoMaquina);
                    System.out.println("Músculo de la máquina: " + controller.maquina.getMusculo());
                    break;

                case 13:
                    System.out.print("Ingrese la disponibilidad de la máquina (disponible/ocupada): ");
                    boolean disponibilidadMaquina = scanner.nextBoolean();  
                    controller.maquina.setEstado(disponibilidadMaquina);
                    System.out.println("Disponibilidad de la máquina: " + (controller.maquina.isEstado() ? "Disponible" : "Ocupada"));
                    break;
                
                case 14:
                    System.out.print("Cambiar estado de la máquina: ");
                    controller.maquina.cambiarEstado();
                    System.out.println("Estado de la máquina cambiado a: " + (controller.maquina.isEstado() ? "Disponible" : "Ocupada"));
                    break;
                
                case 15:
                    System.out.print("Información de la máquina: ");
                    String infoMaquina = controller.maquina.infoMaquina();
                    System.out.println(infoMaquina);
                    break;
                
                case 16:
                    System.out.print("Ingrese el peso de las mancuernas: ");
                    double pesoMancuernas = scanner.nextDouble();
                    controller.setPesoMancuernas(pesoMancuernas);
                    System.out.println("Peso de las mancuernas establecido a: " + controller.getPesoMancuernas());
                    break;
                
                case 17:
                    System.out.println("ingresa el estado de las mancuernas (disponible/ocupada): ");
                    boolean estadoMancuernas = scanner.nextBoolean();
                    controller.ObtenerEstadoMancuerna(estadoMancuernas);
                    System.out.println("Estado de las mancuernas: " + (controller.getEstadoMancuernas() ? "Disponible" : "Ocupada"));
                    break;
                
                case 0:
                    System.out.println("Saliendo del gimnasio...");
                    scanner.close();
                    return;
            }
        }
    }
}



