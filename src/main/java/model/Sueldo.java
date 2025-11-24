package model;

/**
 * Clase Sueldo donde se calcula el sueldo neto en base a la provision del empleado y su sueldo base
 */
public class Sueldo {
    private int sueldoBase;
    private String provision; //Fonasa o Isapre
    private double descuentoSalud; //Fonasa = 7%, Isapre = 10%;
    private int sueldoNeto;

    public static final double descuentoFonasa = 0.07; //Valores del descuento
    public static final double descuentoIsapre = 0.1;

    public Sueldo(int sueldoBase, String provision, double descuentoSalud, int sueldoNeto) {
        this.sueldoBase = sueldoBase;
        this.provision = provision;
        this.descuentoSalud = descuentoSalud;
        this.sueldoNeto = sueldoNeto;
    }

    @Override
    public String toString() {
        return sueldoNeto + " liquido";
    }
}
