package cl.duocuc.empleados;

public class Main {
    public static void main(String[] args) {

        Direccion direccion1 =
                new Direccion("Tremmer", 453, "Puerto Varas");

        Direccion direccion2 =
                new Direccion("Rosas", 453, "Llanquihue");

        Direccion direccion3 =
                new Direccion("San Francisco", 312, "Llanquihue");

        Persona cliente =
                new Persona(
                        "18314543-3",
                        "Camilo Pinto",
                        "967045766",
                        direccion1);

        Persona proveedor =
                new Persona(
                        "10775678-5",
                        "Marcia Martinez",
                        "914315432",
                        direccion2);

        Empleado guia =
                new Empleado(
                        "14232042-k",
                        "Carlos Soto",
                        "99495145",
                        direccion3,
                        "Guia Volcán");

        System.out.println(cliente);
        System.out.println();

        System.out.println(proveedor);
        System.out.println();

        System.out.println(guia);
    }


}
