package TCPFlujoContinuo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerContinuo {

    public static void main(String[] args) throws IOException {

        int numeroPuerto = 6000;
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        String cadena = "";

        System.out.println("Esperando conexion...");
        Socket clienteConectado = servidor.accept();
        System.out.println("Cliente conectado...");

        // CREO FLUJO DE SALIDA AL CLIENTE
        PrintWriter fsalidado = new PrintWriter(clienteConectado.getOutputStream(), true);

        // CREO FLUJO DE ENTRADA AL CLIENTE
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(clienteConectado.getInputStream()));

        while ((cadena = fentrada.readLine()) != null) {
            if (cadena.equals("*"))  break;
            

            String cadenaMayusculas = cadena.toUpperCase();  
            fsalidado.println(cadenaMayusculas);  
            System.out.println("Recibiendo: " + cadena + " Pasando: " + cadenaMayusculas);
        }

        // CERRAR STREAMS Y SOCKETS
        System.out.println("Cerrando conexion...");
        fentrada.close();
        fsalidado.close();
        clienteConectado.close();
        servidor.close();
    }

}
