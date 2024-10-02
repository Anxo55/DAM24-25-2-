package ArchivosBinarios;

import java.io.*;
import java.util.Scanner;

public class Principal {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		
		try {
			leerFicheroDoubleCadenas(EscribirEnterosCadenas());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void escribirFicheroBinario()
	{
		DataOutputStream ds = null;
		File miFichero = null;
		try {
			miFichero = GestionFicheros.seleccionFichero();
			FileOutputStream fe = new FileOutputStream(miFichero, true);
			ds = new DataOutputStream(fe);
			// array de enteros

			double[] array = { 5.25, 145.18, 2.37, 143.12, 147.10, 169.19, 47.65 };
			String[] nombres = { "Beatriz", "Ana", "Maria", "Juan", "Pedro", "Teresa", "Marta" };
			for (double i : array) {
				ds.writeDouble(i);
			}
			for (String s : nombres) {
				//ds.writeUTF(s);
			}
			// ANÁLOGO A LO ANTERIOR
			for (int i = 0; i < nombres.length; i++) {
				// ds.writeUTF(nombres[i]);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se pudo abrir el fichero Enteros.txt");

		} catch (IOException e) {
			System.out.println("No se pudo escribir en el fichero Enteros.txt");
		} finally {
			try {
				ds.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		try {
			leerFicheroBinario(miFichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void leerFicheroBinario(File ficheroALeer) throws IOException {
		try {
			FileInputStream fis=new FileInputStream(ficheroALeer);
			DataInputStream dis=new DataInputStream(fis);
			while(true) {
				System.out.println(dis.readDouble());
			}
		} catch(EOFException eof) {
			System.out.println("Fin de fichero");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void leerFicheroDoubleCadenas(File ficheroALeer) throws IOException {
		try {
			FileInputStream fis=new FileInputStream(ficheroALeer);
			DataInputStream dis=new DataInputStream(fis);
			while(true) {
				System.out.println(dis.readDouble());
				System.out.println(dis.readUTF());
                
                double edad = dis.readDouble();
				String nombre = dis.readUTF();
				
				// Mostrar los datos por consola
				System.out.println("Nombre: " + nombre + ", Edad: " + edad);
			
			}
		} catch(EOFException eof) {
			System.out.println("Fin de fichero");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static File EscribirEnterosCadenas() {
		DataOutputStream ds = null;
		File miFichero = null;
		try {
			miFichero = GestionFicheros.seleccionFichero();
			FileOutputStream fe = new FileOutputStream(miFichero, true);
			ds = new DataOutputStream(fe);
			// array de enteros

            System.out.println("Personas a ingresar: ");
            int numeroPersonas = sc.nextInt();
            sc.nextLine();

            for(int i=0; i<numeroPersonas; i++) {
                System.out.println("Nombre: ");
                String nombre = sc.nextLine();

                System.out.println("Edad: ");
                int edad = sc.nextInt();
                sc.nextLine();

                ds.writeDouble(edad);
                ds.writeUTF(nombre);
            }
 
			double[] array = { 5.25, 145.18, 2.37, 143.12, 147.10, 169.19, 47.65 };
			String[] nombres = { "Beatriz", "Ana", "Maria", "Juan", "Pedro", "Teresa", "Marta" };
			if(array.length==nombres.length) {
				for(int i=0;i<nombres.length;i++) {
					ds.writeDouble(array[i]);
					ds.writeUTF(nombres[i]);
				}
				
			}
			

		} catch (FileNotFoundException fnfe) {
			System.out.println("No se pudo abrir el fichero Enteros.txt");

		} catch (IOException e) {
			System.out.println("No se pudo escribir en el fichero Enteros.txt");
		} finally {

			try {
				
				ds.close();
				return miFichero;
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return miFichero;
	}
}