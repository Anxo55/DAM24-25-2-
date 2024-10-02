package ArchivosBinarios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.filechooser.FileFilter;
import javax.swing.JFileChooser;

public class GestionFicheros {

	public static File seleccionFichero() {
		JFileChooser jfc=new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int seleccion=jfc.showOpenDialog(null);
		if(seleccion==JFileChooser.APPROVE_OPTION) {
			return jfc.getSelectedFile();
		}else {
            throw new NullPointerException("No se ha seleccionado ");
			
		}
	}
	
	public static File seleccionFicheroCSV() {
		JFileChooser jfc=new JFileChooser();
		CSVFileFilter csvFilter = new CSVFileFilter();

		jfc.setFileFilter(csvFilter);
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int seleccion=jfc.showOpenDialog(null);
		if(seleccion==JFileChooser.APPROVE_OPTION) {
			return jfc.getSelectedFile();
		}else {
			return null;
		}
	}
	
	public static boolean anhadirLineaCSV(File fichero, String linea) {
		try {
				if(fichero.exists()) {
					if(fichero.getName().endsWith(".csv")) {
						FileWriter fw = new FileWriter(fichero, true);
						fw.write("\n");
						fw.write(linea);
						fw.close();
					}else {
						throw new IllegalArgumentException("No es un fichero CSV");
					}
					return true;
				}else {
					throw new IOException("No existe el fichero");
					
				}
			}catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
				return false;
			}catch (IOException ioe) {
				System.out.println(ioe.getMessage());
			}
		return false;
		
	}
	
	

}
