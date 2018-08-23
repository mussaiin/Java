/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chpt30;

/**
 *
 * @author Nurlybek
 */
public class PrintChars implements Runnable{

    char c;

    public PrintChars(char c) {
        this.c = c;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(c);
            //Thread.yield();
            try{
                Thread.sleep(1);
            } catch(InterruptedException e){}
        }
    }
    
}
