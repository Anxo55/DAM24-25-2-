package TCPFlujoContinuo;

import java.io.*;
import java.net.*;

public class ClienteContinuo {

    public static void main(String[] args) throws IOException {

        String Host = "localhost";
        int Puerto = 6000;
        Socket Cliente = new Socket(Host, Puerto);

        // CREO FLUJO DE SALIDA AL SERVIDOR
        PrintWriter fsalida = new PrintWriter(Cliente.getOutputStream(), true);
        // CREO FLUJO DE ENTRADA AL SERVIDOR
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));

        // FLUJO PARA ENTRADA ESTANDAR
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String cadena, eco="";
        System.out.println("Introduce cadena: ");
        cadena = in.readLine(); //lectura por teclado
        
        while (cadena != null && !cadena.equals("*")) {
            fsalida.println(cadena); //envio cadena al servidor
            eco=fentrada.readLine(); // recibo cadena del servidor
            System.out.println(" =>ECO: "+eco);

            System.out.println("Introduce cadena: ");
            cadena = in.readLine(); //lectura por teclado
        }
        fsalida.close();
        fentrada.close();
        System.out.println("Fin del envio");
        in.close();
        Cliente.close(); //Cierra el socket
    }
    
}
