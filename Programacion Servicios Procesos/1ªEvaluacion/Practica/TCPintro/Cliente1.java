package TCPintro;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
// import java.net.UnknownHostException;

public class Cliente1 {

    public static void main(String[] args) throws  IOException {

        // Sin estas dos lineas el cliente no sabe donde conectarse
        String Host = "localhost";
        int Puerto = 6000; //puerto remoto

        // ABRIR SOCKET
        Socket Cliente = new Socket(Host, Puerto); //conecta

        // conecta
        InetAddress i = Cliente.getInetAddress();
        System.out.println("Puerto local: "+Cliente.getLocalPort());
        System.out.println("Puerto Remoto: "+Cliente.getPort());
        System.out.println("Host Remoto: "+i.getHostName().toString());
        System.out.println("IP Host Remoto: "+i.getHostAddress().toString());
        
        // Recibir mensaje del servidor
        InputStream entrada = Cliente.getInputStream();
        BufferedReader lector = new BufferedReader(new InputStreamReader(entrada));
        String mensaje = lector.readLine();
        System.out.println("Mensaje del servidor: " + mensaje);

        Cliente.close(); //Cierra el socket    
            
    }
    
}
