package ManejoFicheros;

import java.io.File;

import javax.swing.JFileChooser;

public class Principal {

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(0);
        int seleccion = fileChooser.showOpenDialog(null); // fileChooser, donde está el null
        System.out.println(seleccion);

        if(seleccion==0) {
            File mifichero = fileChooser.getSelectedFile();
            System.out.println(mifichero.getAbsolutePath());
            System.out.println(mifichero.canRead());
            System.out.println(mifichero.canWrite());
            System.out.println(mifichero.getName());
            if(mifichero.exists()) {
                System.out.println("El fichero existe");
                if (mifichero.isFile()) {
                    System.out.println("Es un fichero");
                }
            }else {
                System.out.println("El fichero no existe");
                String[] listado = mifichero.list();
            }
        }

                
    }
    
}
