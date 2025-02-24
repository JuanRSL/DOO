package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Ventana;

public class Control {
    public void run() {
        Ventana ventana = new Ventana();  // Instanciamos la clase Ventana para interactuar con ella
        int opcion = 0;

        do {
            // Pedimos la opción al usuario
            opcion = ventana.pedirOpcion();

            switch (opcion) {
                case 1:
                    // Mostrar la información de los empleados
                    ventana.mostrarEmpleados();
                    break;
                case 2:
                    // Agregar un nuevo empleado
                    ventana.agregarEmpleado();
                    break;
                case 3:
                    // Salir del programa
                    System.out.println("Saliendo...");
                    break;
                default:
                    // Opción no válida
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);  // Continuamos el ciclo hasta que el usuario seleccione "Salir"
    }


}


