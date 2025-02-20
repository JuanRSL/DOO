package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.edu.model.Desarrollador;
import co.edu.konradlorenz.edu.model.Empleado;
import co.edu.konradlorenz.edu.model.Gerente;
import co.edu.konradlorenz.edu.model.Vendedor;

public class Controlador {

    public void run() {
        //Creacion de los objetos
        Empleado empleado = new Desarrollador("Pepito", "Perez", "Bronx", "pepito@gmail.com", "Python", 2400);
        Empleado gerente = new Gerente("Zebra", "Rayada","Chapinero","zebraray@gmail.com","Finanzas","Rentabilidad", 3500);
        Empleado vendedor = new Vendedor("Leon","Kennedy","Raccon City","LeonKennedy@gmail.com",3000,true,10000);
     
    }
}
