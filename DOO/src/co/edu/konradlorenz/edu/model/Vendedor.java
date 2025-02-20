package co.edu.konradlorenz.edu.model;

public class Vendedor extends Empleado {

    private boolean atencionCliente;
    private int ventas;

    public Vendedor(String nombre, String apellidos, String direccion, String email, int Salario, boolean atencionCliente, int ventas) {
        super(nombre, apellidos, direccion, email, Salario);
        this.atencionCliente = atencionCliente;
        this.ventas = ventas;
    }

    public boolean isAtencionCliente() {
        return atencionCliente;
    }

    public void setAtencionCliente(boolean atencionCliente) {
        this.atencionCliente = atencionCliente;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int Ventas) {
        this.ventas = Ventas;
    }

}
