package PracticaManejosFicheros;

import java.util.Scanner;
import java.io.File;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta completa del archivo que deseas borrar:");
        String rutaFichero = sc.nextLine();

        File archivo = new File(rutaFichero);

        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("El archivo ha sido borrado con éxito.");
            } else {
                System.out.println("No se pudo borrar el archivo. Asegúrate de que el archivo no esté en uso o que tienes permisos suficientes.");
            }
        } else {
            System.out.println("El archivo no existe en la ruta especificada.");
        }

        sc.close();
    }
}