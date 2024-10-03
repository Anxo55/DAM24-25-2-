package TCPChat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerChat {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numeroPuerto = 6000;

        // Crear el servidor en el puerto especificado
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        System.out.println("Esperando conexión...");

        // Esperar a que un cliente se conecte
        Socket clienteConectado = servidor.accept();
        System.out.println("Cliente conectado...");

        // Crear flujos de entrada y salida
        PrintWriter fsalida = new PrintWriter(clienteConectado.getOutputStream(), true);
        BufferedReader fentrada = new BufferedReader(new InputStreamReader(clienteConectado.getInputStream()));

        String cadena = "";
        // Bucle para manejar la comunicación hasta que el cliente envíe "quit"
        while (!cadena.equals("quit")) {
            // Leer el mensaje del cliente
            cadena = fentrada.readLine();
            System.out.println("Recibiendo: " + cadena);

            // Verificar si el cliente quiere terminar la conversación
            if (cadena.equals("quit")) {
                break;
            }

            // Solicitar y enviar la respuesta al cliente
            System.out.print("Escribe: ");
            String resp = sc.nextLine();
            fsalida.println(resp);
        }

        // Cerrar streams y sockets
        System.out.println("Cerrando conexión...");
        fentrada.close();
        fsalida.close();
        clienteConectado.close();
        servidor.close();
        sc.close();
    }
}
