package data;

import model.Direccion;
import model.Productos;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

    public class GestorDatos {
        public List<Direccion> cargaTxTDireccion (String resourceName) {

            List<Direccion> direccionsList = new ArrayList<>(); //Inicializar la lista

            ClassLoader classLoader =getClass().getClassLoader();

            try {
                InputStream archivo = classLoader.getResourceAsStream(resourceName);
                if (archivo == null) {
                    System.err.println("No se encuentra el archivo " + resourceName);
                    return direccionsList;
                }

                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(archivo));

                    String linea; //Variable donde se va a almacenar la linea
                    int nroLinea = 0; //Numero de linea que se va a revisar

                    while ((linea = br.readLine()) != null) {
                        nroLinea++; //Para sumar la linea

                        if (linea.trim().isEmpty()) continue;

                        //Separamos el archivo por ;
                        String[] split = linea.split(";");


                        System.err.println("Linea " + nroLinea + ": " + split.length);

                        String calle = split[0].trim();
                        String numeroStr = split[1].trim();
                        String ciudad = split[2].trim();
                        String region = split[3].trim();
                        String pais = split[4].trim();

                        int numero = Integer.parseInt(numeroStr); //Para transformar de String a Double las toneladas


                        Direccion direcciones = new Direccion(calle, numero, ciudad, region, pais);
                        direccionsList.add(direcciones);

                    }
                } catch (NullPointerException exception) {
                    System.err.println("Null Pointer Exception");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return direccionsList;
        }

        public List<Productos> cargaTxTProductos (String resourceName) {

            List<Productos> productosList = new ArrayList<>(); //Inicializar la lista

            ClassLoader classLoader =getClass().getClassLoader();

            try {
                InputStream archivo = classLoader.getResourceAsStream(resourceName);
                if (archivo == null) {
                    System.err.println("No se encuentra el archivo " + resourceName);
                    return productosList;
                }

                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(archivo));

                    String linea; //Variable donde se va a almacenar la linea
                    int nroLinea = 0; //Numero de linea que se va a revisar

                    while ((linea = br.readLine()) != null) {
                        nroLinea++; //Para sumar la linea

                        if (linea.trim().isEmpty()) continue;

                        //Separamos el archivo por ;
                        String[] split = linea.split(";");


                        System.err.println("Linea " + nroLinea + ": " + split.length);

                        String nombre = split[0].trim();
                        String comuna = split[1].trim();
                        String toneladasStr = split[2].trim();

                        double toneladas = Double.parseDouble(toneladasStr); //Para transformar de String a Double las toneladas


                        Productos productos = new Productos(nombre,comuna,toneladas);
                        productosList.add(productos);

                    }
                } catch (NullPointerException exception) {
                    System.err.println("D");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return productosList;
        }
}
