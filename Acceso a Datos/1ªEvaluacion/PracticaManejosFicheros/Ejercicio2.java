package PracticaManejosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Partiendo del fichero de csv de ejemplo, crear un programa de Java que muestre los
// datos de todos aquellos restaurantes cuyo código postal empiece por 6.

public class Ejercicio2 {

    public static void main(String[] args) {
        
        String File = "C:\\Users\\anxoc\\DAM24-25\\DAM24-25-2-\\Acceso a Datos\\1ªEvaluacion\\Restaurants.csv"; 
        String linea;
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(File))) {
            while ((linea = br.readLine()) != null) {
                String[] restaurante = linea.split(cvsSplitBy);
                if (restaurante[4].startsWith("6")) { 
                    System.out.println("Nombre: " + restaurante[1]);
                    System.out.println("Direccion: " + restaurante[2]);
                    System.out.println("Ciudad: " + restaurante[3]);
                    System.out.println("Codigo Postal: " + restaurante[4]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
