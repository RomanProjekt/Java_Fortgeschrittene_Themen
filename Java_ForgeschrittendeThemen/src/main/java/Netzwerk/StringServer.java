/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Netzwerk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author roman
 */
public class StringServer {
    
    private final ServerSocket server;
    public StringServer(int port) throws IOException {
        server = new ServerSocket(port);
    }

    private void verbinde() {

        while (true) {
            
            Socket socket = null;
            try {
                System.out.println("Server start... ");
                socket = server.accept();
                reinRaus(socket);
            }

            catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (socket != null)
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }
    }

    private void reinRaus(Socket socket) throws IOException {
        BufferedReader rein = new BufferedReader(new InputStreamReader(socket
                .getInputStream()));
        PrintStream raus = new PrintStream(socket.getOutputStream());
        String s;
        System.out.println("Das wird auf dem Server ausgeführt!");
        
        while(rein.ready()) {
            s = rein.readLine();
            raus.println(s);
        }
    }

    public static void main(String[] args) throws IOException {
        StringServer server = new StringServer(3141);
        server.verbinde();
    } 
    
}
