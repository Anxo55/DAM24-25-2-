package PracticaManejosFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Ejercicio2bis {

    public static void main(String[] args) {
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecciona el archivo CSV"); 

        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos CSV", "csv");
        fileChooser.setFileFilter(filter);

        
        int userSelection = fileChooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath(); 

            
            String linea;
            String cvsSplitBy = ",";

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
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
        } else {
            System.out.println("No se ha seleccionado ningún archivo.");
        }
    }
}