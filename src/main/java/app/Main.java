package app;

import data.GestorDatos;
import model.*;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Clase principal donde se ejecutará la impresión de los datos de los empleados.
 * Funciona tomando la clase Empleado que tiene la clase Sueldo y Direccion anidada en ella.
 * Ya con esto, se permitirá al usuario agregar empleados en el futuro.
 */
public class Main {
    public static void main (String[] args) throws IOException {
        GestorDatos gestorDatos = new GestorDatos();//Instanciar la clase dentro de Main
        List<Productos> productos = gestorDatos.cargaTxTProductos("Centros.txt");
        List<Direccion> direccions = gestorDatos.cargaTxTDireccion("trabajadoresDireccion.txt");

        Scanner input = new Scanner(System.in);
        int menuMainInput = 0; //Variables de prueba
        int menuFilterInput;
        double qtyToneladas;


        do {
            menuMain();

            try {
                System.out.print("Por favor elija un número ");
                menuMainInput = input.nextInt();
                
                while (menuMainInput <= 0 || menuMainInput >= 4) {
                    menuMainInput = 0;
                    System.out.println("Elija un número valido");
                    menuMainInput = input.nextInt();
                }

                switch (menuMainInput) {
                    case 1:
                        menuFilter();
                        System.out.print("Por favor elija su opcion ");
                        menuFilterInput = input.nextInt();

                        while (menuFilterInput <= 0 || menuFilterInput >= 4) {
                            System.out.println("Elija un número valido");
                            menuFilterInput = input.nextInt();
                        }

                        if (menuFilterInput == 1) {
                            System.out.println("Elija el filtro para evaluar (toneladas mayor o igual que): ");
                            qtyToneladas = input.nextDouble();

                            while (qtyToneladas < 0) {
                                System.out.println("Por favor elija números positivos");
                                qtyToneladas = input.nextDouble();
                            }

                            for (Productos productos1 : productos) {
                                if (productos1.getToneladas() >= qtyToneladas) {
                                    System.out.println(productos1);
                                }
                            }
                        }
                        break;
                    case 2:
                        for (Productos productos1: productos) {
                            System.out.println(productos1);
                        }

                        for (Direccion direccion: direccions) {
                            System.out.println(direccion);
                        }
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Por favor ingrese un número");
                input.nextLine();
            }

        } while (menuMainInput != 3);

        System.out.println("Gracias por usar el sistema");
    }

    private static void menuMain () {
        System.out.println("======MENU======");
        System.out.println("1. Ingresar filtro para revisar");
        System.out.println("2. Ver prints de los archivos .txt");
        System.out.println("3. Salir");
    }

    private static void menuFilter() {
        System.out.println("Filtros disponibles:");
        System.out.println("1. Centros por Toneladas");
        System.out.println("3. Salir");
    }
}
