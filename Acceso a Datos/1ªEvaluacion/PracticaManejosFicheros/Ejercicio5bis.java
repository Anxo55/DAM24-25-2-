package PracticaManejosFicheros;

import java.io.File;

public class Ejercicio5bis {

    public static void main(String[] args) {
        File ficheroBorrar = GestionFicheros.seleccionFichero();

        try {
        
            if (ficheroBorrar.exists()) {
                System.out.println("Fichero Borrado");
            }else{
                System.out.println("No se ha podido borrar el fichero");
            }
        } catch (Exception e) {
            System.out.println("No se ha seleccionado un fichero");
        }

    }
    
}
