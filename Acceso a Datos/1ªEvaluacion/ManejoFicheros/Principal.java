package ManejoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		JFileChooser fileChooser=new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int seleccion=fileChooser.showOpenDialog(null);
		System.out.println(seleccion);
		
		if(seleccion==0) {
			File miFichero=fileChooser.getSelectedFile();
				
			if(miFichero.exists()) {
				System.out.println("El fichero existe");
				if(miFichero.isFile()) {
					System.out.println("Es un fichero");
	
						mostrarFichero(miFichero);
						System.out.println("TEXTO A AÑADIR");
						Scanner sc=new Scanner(System.in);
						String textoNuevo=sc.nextLine();
						escribirFichero(miFichero,textoNuevo,false);
						System.out.println("FICHERO MODIFICADO");
						mostrarFichero(miFichero);
						miFichero.delete();
					
				}else if (miFichero.isDirectory()) {
					System.out.println("No es un fichero");
					String [] listado=miFichero.list();
					for(String contenido:listado) {
						System.out.println(contenido);
					}
				}
			}else {
				System.out.println("El fichero no existe");
			}
		}
		

	}
	
	public static void mostrarFichero(File miFichero) {
		try {
			FileReader fr=new FileReader(miFichero);
			BufferedReader bf=new BufferedReader(fr);
			String linea;
			while((linea=bf.readLine())!=null) {
				System.out.println(linea);
			}
			bf.close();
			fr.close();
		}catch(FileNotFoundException fne) {
			System.out.println("El fichero no existe");
		}catch(IOException ioe ) {
			System.out.println("Error en la lectura del fichero");
		}catch(Exception e) {
			System.out.println("NOS VAMOS A MORIR");
		}
	}
	
	public static void escribirFichero(File fichero,String texto,boolean anhadir) {
		try {
			FileWriter fw=new FileWriter(fichero, anhadir);
			PrintWriter pw=new PrintWriter(fw,anhadir);
			pw.println(texto);
			
			pw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
