package TCPintro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {

    public static void main(String[] args) throws IOException {

        System.out.println("Tercer esquema tipico de servior TCP");
        int Puerto = 6000;
        ServerSocket Servidor = new ServerSocket(Puerto);

        System.out.println("Escuchando en "+ Servidor.getLocalPort());
        
        Socket cliente = Servidor.accept(); 
        //esperando a un cliente
        // realizar acciones con cliente1
        System.out.println("Alguien se ha conectado...veamos que dice");


        // ENTRADA 
         InputStream entrada = null;
            try {
                entrada = cliente.getInputStream();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }    
            DataInputStream flujoEntrada = new DataInputStream(entrada);


            // EL CLIENTE ME ENVIA UN MENSAJE
            String entra = flujoEntrada.readUTF();

            System.out.println("Recibiendo del CLIENTE: \n\t "+entra);

            //SALIDA
            OutputStream salida = null;
            try {
                salida = cliente.getOutputStream();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            DataOutputStream flujoSalida = new DataOutputStream(salida);

            // ENVIO UN SALUDO AL CLIENTE
            flujoSalida.writeUTF("Saludos al cliente del servidor\n" +entra.toUpperCase());

            cliente.close();
            System.out.println("Cerrando el servidor...");

            Servidor.close();
    }
    
}
