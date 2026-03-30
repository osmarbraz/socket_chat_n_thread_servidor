
import java.net.*;
import java.io.*;

public class Principal {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(4444);
            System.out.println("Aguardando cliente!");
            System.out.println("Servidor :" + servidor.getInetAddress().getLocalHost());
            while (true) {
                Socket socket = servidor.accept(); // espera	 
                System.out.println("Chegou um cliente!");
                Servidor cliente = new Servidor(socket);                
                cliente.start();
            }
        } catch (IOException ioe) {
             System.out.println("Excecao: " + ioe.getMessage());
        }
    }
}
