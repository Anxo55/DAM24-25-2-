package ManejoFicheros;

import javax.swing.JFileChooser;

public class Principal {

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(fileChooser);
        // int seleccion2 =  fileChooser.showOpenDialog(null);
        
    }
    
}
