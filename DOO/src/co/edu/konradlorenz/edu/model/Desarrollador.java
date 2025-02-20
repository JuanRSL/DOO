package co.edu.konradlorenz.edu.model;

public class Desarrollador extends Empleado {

    private String lenguajeProgramacion;

    public Desarrollador(String nombre, String apellidos, String direccion, String email, String lenguajeProgramacion, int Salario) {
        super(nombre, apellidos, direccion, email, Salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }
}
