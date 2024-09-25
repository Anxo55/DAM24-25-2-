package PracticaManejosFicheros;

import java.io.FileWriter;
import java.util.Scanner;

// Partiendo del fichero de csv de ejemplo, crear un programa de Java que permita al
// usuario añadir datos nuevos a ese fichero, utilizando el mismo formato que los ya
// existentes, nombre, direccion, ciudad, codigoPostal.

public class Ejercicio3bis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String File = "C:\\Users\\anxoc\\DAM24-25\\DAM24-25-2-\\Acceso a Datos\\1ªEvaluacion\\Restaurants.csv";

        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce la dirección: ");
        String direccion = sc.nextLine();

        System.out.println("Inrtoduce la ciudad: ");
        String ciudad = sc.nextLine();

        System.out.println("Introduce el codigo postal: ");
        String codigoPostal = sc.nextLine();

        String nuevoRestaurante = nombre + " " + direccion + " " + ciudad + " " + codigoPostal;

        try (FileWriter fileWriter = new FileWriter(File, true)){
            fileWriter.append(nuevoRestaurante);
            fileWriter.append("\n");
            System.out.println("Restaurante añadido correctamente al archivo.");
            
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al intentar escribir en el archivo.");
            e.printStackTrace();
        }
        
    }
    
}
