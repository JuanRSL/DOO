package co.edu.konradlorenz.edu.model;

public class Gerente extends Empleado {
//atributos de Gerente

    private String areaCargo;
    private String departamento;
    
//constructor de la clase
    public Gerente( String nombre, String apellidos, String direccion, String email, String areaCargo, String departamento, int Salario) {
        super(nombre, apellidos, direccion, email, Salario);
        this.areaCargo = areaCargo;
        this.departamento = departamento;
    }

    public String getAreaCargo() {
        return areaCargo;
    }

    public void setAreaCargo(String areaCargo) {
        this.areaCargo = areaCargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
