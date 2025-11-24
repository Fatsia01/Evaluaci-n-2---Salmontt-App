package model;

/**
 * Clase empleado: contiene el nombre, apellido, genero, rut, telefono, direccion,
 * estado civil y sueldo final de los empleados que ingrese.
 * Las variables direccion y sueldo final son clases que contienen sus propios datos.
 */

public class Empleado {
    private String nombre;
    private String apellido;
    private String genero;
    private int RUT;
    private int telefono;
    private Direccion direccion;
    private String estadoCivil;
    private Sueldo sueldo;
    private Productos direccionTrabajo;

    public Empleado(String nombre, String apellido, String genero, int RUT, int telefono, Direccion direccion, String estadoCivil, Sueldo sueldo, Productos direccionTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.RUT = RUT;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.sueldo = sueldo;
        this.direccionTrabajo = direccionTrabajo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getRUT() {
        return RUT;
    }

    public void setRUT(int RUT) {
        this.RUT = RUT;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }

    public Productos getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public void setDireccionTrabajo(Productos direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
    }

    @Override
    public String toString() {
        return
                """
                        =====INFORMACION DE EMPLEADO=====
                        Nombre: %s
                        Apellido: %s
                        Genero: %s
                        RUT: %d
                        Telefono: %d
                        Dirrecion: %s
                        Estado Civil: %s
                        Sueldo: %s
                        Dirección de trabajo: %s 
                        
                        """.formatted(nombre, apellido, genero, RUT, telefono, direccion, estadoCivil, sueldo, direccionTrabajo);
    }
}
