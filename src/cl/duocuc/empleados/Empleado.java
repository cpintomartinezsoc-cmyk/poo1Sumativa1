package cl.duocuc.empleados;

public class Empleado extends Persona {

    private String cargo;

    public Empleado(String rut, String nombre, String telefono, Direccion direccion, String cargo) {
        super(rut, nombre, telefono, direccion);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public String toString() {

        return "Empleado{" +
                "\n rut='" + getRut() + '\'' +
                ",\n nombre='" + getNombre() + '\'' +
                ",\n telefono='" + getTelefono() + '\'' +
                ",\n cargo='" + cargo + '\'' +
                ",\n direccion=" + getDireccion() +
                "\n}";
    }}