package PracticaManejosFicheros;

import java.io.File;

// Programa de java, que para cualquier ruta indique, si el ficher 
// existe o no, si se trata de un directorio o de un fichero
// En caso de ser fichero, mostrar(nombre, tamaño, Permisos de elctura y escritura)

public class Ejercicio1 {

    public static void main(String[] args) {
    
        String ruta = "C:\\Users\\anxoc\\DAM24-25\\DAM24-25-2-\\Acceso a Datos\\1ªEvaluacion\\miFichero.txt"; 

        File archivo = new File(ruta);

        if (archivo.exists()) {
            if (archivo.isDirectory()) {
                System.out.println("La ruta corresponde a un directorio.");
            } else {
                System.out.println("La ruta corresponde a un fichero.");
                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Tamaño: " + archivo.length() + " bytes");
                // Te lo devuelve como un booelan
                System.out.println("Permisos de lectura: " + (archivo.canRead()));
                System.out.println("Permisos de escritura: " + (archivo.canWrite()));
            }
        } else {
            System.out.println("El fichero o directorio no existe.");
        }
    }
}