package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.edu.model.Desarrollador;
import co.edu.konradlorenz.edu.model.Empleado;
import co.edu.konradlorenz.edu.model.Gerente;
import co.edu.konradlorenz.edu.model.Vendedor;
import co.edu.konradlorenz.view.Ventana;
import java.util.ArrayList;

public class Control {

    private final ArrayList<Empleado> empleados = new ArrayList<>();
    Ventana ventana = new Ventana();// Instanciamos la clase Ventana para interactuar con ella

    public void run() {
        int opcion = 0;

        do {
            // Pedimos la opción al usuario
            opcion = ventana.pedirOpcion();

            switch (opcion) {
                case 1:
                    // Mostrar la información de los empleados
                    mostrarEmpleados();
                    break;
                case 2:
                    // Agregar un nuevo empleado
                    agregarEmpleado();
                    break;
                case 3:
                    // Salir del programa
                    ventana.mostrarMensaje("Saliendo...");
                    break;
                default:
                    // Opción no válida
                    ventana.mostrarMensaje("Opcion no valida");
            }
        } while (opcion != 3);  // Continuamos el ciclo hasta que el usuario seleccione "Salir"
    }

    public void agregarEmpleado() {

        String nombre = ventana.pedirString("Ingrese el Nombre:");
        String apellidos = ventana.pedirString("Ingrese el Apellido:");
        String direccion = ventana.pedirString("Ingrese la dirección: ");
        String email = ventana.pedirString("Ingrese el email: ");
        int salario = Integer.parseInt(ventana.pedirString("Ingrese el salario:"));
        ventana.mostrarMensaje("Seleccione el tipo de empleado:");
        ventana.mostrarMensaje("1. Desarrollador");
        ventana.mostrarMensaje("2. Gerente");
        ventana.mostrarMensaje("3. Vendedor");
        int tipoEmpleado = ventana.pedirOpcion();

        switch (tipoEmpleado) {
            case 1: // Desarrollador
                String lenguaje = ventana.pedirString("Ingrese el lenguaje de programación: ");
                empleados.add(new Desarrollador(nombre, apellidos, direccion, email, lenguaje, salario));
                ventana.mostrarMensaje("Desarrollador agregado.");
                break;
            case 2: // Gerente
                String areaCargo = ventana.pedirString("Ingrese el área de cargo: ");
                String departamento = ventana.pedirString("Ingrese el departamento: ");
                empleados.add(new Gerente(nombre, apellidos, direccion, email, areaCargo, departamento, salario));
                ventana.mostrarMensaje("Gerente agregado.");
                break;
            case 3: // Vendedor
                boolean atencionCliente = Boolean.getBoolean(ventana.pedirString("¿Atención al cliente (true/false)?"));
                int ventas = Integer.parseInt(ventana.pedirString("Ingrese la cantidad de ventas realizadas"));
                empleados.add(new Vendedor(nombre, apellidos, direccion, email, salario, atencionCliente, ventas));
                ventana.mostrarMensaje("Vendedor agregado.");
                break;
            default:
                ventana.mostrarMensaje("Opción no válida.");
        }
    }

    // Método para mostrar la información de los empleados
    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            ventana.mostrarMensaje("No hay empleados registrados.");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
}
