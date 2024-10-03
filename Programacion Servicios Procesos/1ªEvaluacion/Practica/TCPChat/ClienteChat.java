package TCPChat;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteChat {

    public static void main(String[] args) throws IOException {
        String Host = "localhost";
        int Puerto = 6000;

        // Conectar al servidor
        Socket Cliente = new Socket(Host, Puerto);

        // Crear flujos de entrada y salida
        PrintWriter fsalida = new PrintWriter(Cliente.getOutputStream(), true);
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(Cliente.getInputStream()));

        // Flujo de entrada estándar (teclado)
        Scanner sc = new Scanner(System.in);
        System.out.println("Cliente chat (corta con quit)");

        String cadena;
        System.out.print("Envia cadena: ");
        cadena = sc.nextLine(); // Lectura desde el teclado

        // Bucle para enviar y recibir mensajes hasta que se envíe "quit"
        while (!cadena.equals("quit")) {
            // Enviar mensaje al servidor
            fsalida.println(cadena);

            // Recibir respuesta del servidor
            String eco = fentrada.readLine();
            System.out.println("Respuesta: " + eco);

            // Leer el siguiente mensaje a enviar
            System.out.print("Envia cadena: ");
            cadena = sc.nextLine();
        }

        // Cerrar streams y sockets
        fsalida.close();
        fentrada.close();
        System.out.println("Fin del cliente chat...");
        sc.close();
        Cliente.close(); // Cierra el socket
    }
}