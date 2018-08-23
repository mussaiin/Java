/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt31_32;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Server {
    int port;
    ServerSocket server;
    
    public static void main(String[] args) throws Exception {
        new Server(8000).run();
    }

    public Server() {}

    public Server(int port) { this.port = port; }

    public Server(int port, ServerSocket server) { this.port = port; this.server = server; }
    
    public void run() throws Exception{
        server = new ServerSocket(port);
        System.out.println("Host is listening on port "+port+"...");
        
        while (true) {            
            Socket client = server.accept();
            System.out.println("Client has connected.");
            PrintStream out = new PrintStream(client.getOutputStream());

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Scanner sc = new Scanner(client.getInputStream());
                        while (sc.hasNextLine()) {                            
                            System.out.println("Client:"+ sc.nextLine());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                out.println(sc.nextLine());
            }
            out.close();
            sc.close();
            server.close();
        }
    }
    
}
