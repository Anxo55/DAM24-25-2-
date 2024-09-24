// package Practica.Ejemplo1URL;
package Ejemplo1URL;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

// En este ejemplo crea un objeto URL a dicha direccion, abre
// una conexion con el creando un objeto InputStream y lo utiliza
// como flujo de entrada para leer los datos de la pagina
// inicial del sitio

// Al ejecutar se muestra en pantalla el codigo HTML
// de la pagina inical del sitio

public class Ejemplo2URL {

    public static void main(String[] args) {
        
        URL url = null;
        try {
            // url = new URL("http://www.elaltozano.es");
            url = new URL("https://as.com/");

            // url = new URL("http://www.cebem.net");
            // url = new URL("https://farodevigo.es/");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BufferedReader in;

        try (FileWriter fileWriter = new FileWriter("salida.txt")){
            // SOLO ABRE EL STRING PERO NO SABE USARLO
            InputStream inputStream = url.openStream();
            in = new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            while ((inputLine = in.readLine()) != null) 
                // System.out.println(inputLine);
                fileWriter.write(inputLine + "\n" );
            in.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
