package TCPintro;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente2 {

    public static void main(String[] args) throws  IOException {

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

        //ENTRADA SALIDA
       
        
        
            OutputStream salida = null;
            try {
                salida = cliente.getOutputStream();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            DataOutputStream flujoSalida = new DataOutputStream(salida);

            // ENVIO UN SALUDO AL SERVIDOR
            flujoSalida.writeUTF("Saludo al servidor desde el CLIENTE POLLO POLLO");

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
            cliente.close();
    }
    
}
