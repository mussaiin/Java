/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chpt31_32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Nurlybek
 */
public class Client {
    String host;
    int port;
    public static void main(String[] args) throws Exception{
        new Client("127.0.0.1", 8000).run();
        
    }

    public Client() {}

    public Client(String host, int port) { this.host = host; this.port = port; }
    
    public void run() throws Exception{
        Socket client = new Socket(host, port);
        System.out.println("Connected to server!");
        PrintStream out = new PrintStream(client.getOutputStream());
        InputStream in = client.getInputStream();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Scanner sc = new Scanner(client.getInputStream());
                        while (sc.hasNextLine()) {                            
                            System.out.println("Client: "+ sc.nextLine());
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
            client.close();
    }
}
