package PracticaManejosFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Partiendo del fichero de csv de ejemplo, crear un programa de Java que permita al
// usuario añadir datos nuevos a ese fichero, utilizando el mismo formato que los ya
// existentes.

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String File = "C:\\Users\\anxoc\\DAM24-25\\DAM24-25-2-\\Acceso a Datos\\1ªEvaluacion\\Restaurants.csv";

        System.out.println("Introduce el nombre del restaurante:");
        String nombre = sc.nextLine();

        System.out.println("Introduce la dirección:");
        String direccion = sc.nextLine();

        System.out.println("Introduce la ciudad:");
        String ciudad = sc.nextLine();

        System.out.println("Introduce el código postal:");
        String codigoPostal = sc.nextLine();

        
        String newRestaurantData = nombre + "," + direccion + "," + ciudad + "," + codigoPostal;

        try (FileWriter writer = new FileWriter(File, true)) {
            writer.append(newRestaurantData);
            writer.append('\n'); 
            System.out.println("Datos añadidos correctamente al archivo CSV.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al intentar escribir en el archivo.");
            e.printStackTrace();
        }
        sc.close();
    }
}
