package model;

/**
 * Clase direccion: donde se guarda la información de la dirección del empleado.
 */

public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;
    private String region;
    private String pais;

    public Direccion(String calle, int numero, String ciudad, String region, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return """
                Calle %s %d %s, Region de %s, %s""".formatted(calle, numero, ciudad, region, pais);
    }
}
