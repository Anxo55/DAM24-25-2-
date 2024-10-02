package TCPintro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Cliente3 {

    public static void main(String[] args) throws  IOException {
        Scanner sc = new Scanner(System.in);

        // Sin estas dos lineas el cliente no sabe donde conectarse
        String Host = "localhost"; //poner nuestra direccion //10.101.11.41 la direccion de pepe
        int Puerto = 6000; //puerto remoto

        // ABRIR SOCKET
        Socket cliente = new Socket(Host, Puerto); //conecta

        // conecta
        InetAddress i = cliente.getInetAddress();
        System.out.println("Puerto local: "+cliente.getLocalPort());
        System.out.println("Puerto Remoto: "+cliente.getPort());
        System.out.println("Host Remoto: "+i.getHostName().toString());
        System.out.println("IP Host Remoto: "+i.getHostAddress().toString());

        //SALIDA
            OutputStream salida = null;
            try {
                salida = cliente.getOutputStream();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            DataOutputStream flujoSalida = new DataOutputStream(salida);

            System.out.println("Keloke: ");
            String sale = sc.nextLine();
            // ENVIO UN SALUDO AL SERVIDOR
            flujoSalida.writeUTF("Saludo al servidor desde el CLIENTE\n "+sale);

            // ENTRADA
            InputStream entrada = null;
            try {
                entrada = cliente.getInputStream();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }    
            DataInputStream flujoEntrada = new DataInputStream(entrada);

            // RECIBIENDO MENSAJE DEL SESRVIDOR
            System.out.println("Recibiendo del SERVIDOR: \n\t "+flujoEntrada.readUTF());

            System.out.println("Cerrando al cliente");
            cliente.close(); //Cierra el socket
    }
    
}
