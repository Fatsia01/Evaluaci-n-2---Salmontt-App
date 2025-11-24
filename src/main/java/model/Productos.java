package model;

public class Productos {

    private String nombre;
    private String comuna;
    private double toneladas;

    public Productos() { // Inicialización de la lista vacía

    }

    public Productos(String nombre, String comuna, double toneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    @Override
    public String toString() {
        return """
                Centro: %s
                Comuna: %s
                Toneladas: %s   
                """.formatted(nombre, comuna, toneladas);
    }
}
