package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {

    private Scanner scanner = new Scanner(System.in);

    // Método para pedir la opción
    public int pedirOpcion() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Mostrar informacion de empleados");
        System.out.println("2. Agregar empleados");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

//metodo para mostrar mensajes
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
//metodo para pedir String
    public static String pedirString(String info) {
        Ventana v = new Ventana();
        System.out.println(info);
        return v.scanner.nextLine();
    }
}
