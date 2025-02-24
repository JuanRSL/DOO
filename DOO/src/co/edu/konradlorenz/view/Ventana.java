package co.edu.konradlorenz.view;

import co.edu.konradlorenz.edu.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Ventana {

    private final Scanner scanner = new Scanner(System.in);
    private final ArrayList<Empleado> empleados = new ArrayList<>();

    // Método para pedir la opción
    public int pedirOpcion() {
        System.out.println("\n--- MENÚ PRINCIPAL ---");
        System.out.println("1. Mostrar informacion de empleados");
        System.out.println("2. Agregar empleados");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    // Método para agregar un empleado
    public void agregarEmpleado() {
        scanner.nextLine();  // Limpiar el buffer del scanner

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese los apellidos: ");
        String apellidos = scanner.nextLine();
        
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        
        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();
        
        System.out.print("Ingrese el salario: ");
        int salario = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer del scanner

        System.out.println("Seleccione el tipo de empleado:");
        System.out.println("1. Desarrollador");
        System.out.println("2. Gerente");
        System.out.println("3. Vendedor");
        int tipoEmpleado = scanner.nextInt();
        scanner.nextLine();  // Limpiar el buffer del scanner

        switch (tipoEmpleado) {
            case 1: // Desarrollador
                System.out.print("Ingrese el lenguaje de programación: ");
                String lenguaje = scanner.nextLine();
                empleados.add(new Desarrollador(nombre, apellidos, direccion, email, lenguaje, salario));
                System.out.println("Desarrollador agregado.");
                break;
            case 2: // Gerente
                System.out.print("Ingrese el área de cargo: ");
                String areaCargo = scanner.nextLine();
                System.out.print("Ingrese el departamento: ");
                String departamento = scanner.nextLine();
                empleados.add(new Gerente(nombre, apellidos, direccion, email, areaCargo, departamento, salario));
                System.out.println("Gerente agregado.");
                break;
            case 3: // Vendedor
                System.out.print("¿Atención al cliente (true/false)? ");
                boolean atencionCliente = scanner.nextBoolean();
                System.out.print("Ingrese la cantidad de ventas realizadas: ");
                int ventas = scanner.nextInt();
                empleados.add(new Vendedor(nombre, apellidos, direccion, email, salario, atencionCliente, ventas));
                System.out.println("Vendedor agregado.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Método para mostrar la información de los empleados
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
}

