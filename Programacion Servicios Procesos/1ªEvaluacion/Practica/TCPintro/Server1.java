package TCPintro;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;

public class Server1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Primer esquema tipico de servior TCP");
        int Puerto = 6000;
        ServerSocket Servidor = new ServerSocket(Puerto);
        System.out.println("Escuchando en "+ Servidor.getLocalPort());
        
        Socket cliente1 = Servidor.accept(); 
        //esperando a un cliente
        // realizar acciones con cliente1
        System.out.println("Alguien se ha conectado...");

        OutputStream salida = cliente1.getOutputStream();
        PrintWriter escritor = new PrintWriter(salida, true);


        
        Socket cliente2 = Servidor.accept(); 
        //esperando a otro cliente
        // realizar acciones con cliente2
        
        System.out.println("HALA!! OTRA CONEXION");

        OutputStream salida2 = cliente2.getOutputStream();
        PrintWriter escritor2 = new PrintWriter(salida2, true);


        Servidor.close(); 
        //cierro socket servidor

        System.out.println("Servidor cerrado...");

    }   
        
}

    
