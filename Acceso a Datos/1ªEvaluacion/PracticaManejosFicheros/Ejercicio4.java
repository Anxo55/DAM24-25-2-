package PracticaManejosFicheros;

// Partiendo del fichero de csv de ejemplo, crear un programa de Java que cree una
// copia de ese fichero llamada “Restaurants2.csv” que contenga los mismos datos
// excepto aquellos correspondientes a los restaurantes cuyo código postal empieza por
// 6.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) {
        String archivoOriginal = "Restaurants.csv";
        String archivoFiltrado = "Restaurants2.csv";

        // Usamos BufferedReader para leer el archivo original y BufferedWriter para escribir el archivo filtrado
        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFiltrado))) {
            
            String linea;
            
            // Leer el encabezado primero (asumiendo que el CSV tiene encabezado)
            String encabezado = br.readLine();
            if (encabezado != null) {
                // Escribimos el encabezado en el nuevo archivo
                bw.write(encabezado);
                bw.newLine();
            }
            
            // Leer el resto de las líneas
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String codigoPostal = datos[2].trim(); // Asumimos que el código postal está en la columna 3 (índice 2)
                
                // Si el código postal no empieza con '6', escribimos la línea en el nuevo archivo
                if (!codigoPostal.startsWith("6")) {
                    bw.write(linea);
                    bw.newLine();
                }
            }
            
            System.out.println("Archivo filtrado creado: " + archivoFiltrado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
