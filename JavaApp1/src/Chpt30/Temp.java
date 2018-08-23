/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chpt30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Nurlybek
 */
public class Temp {
    private static Account account = new Account();
    public static void main(String[] args) {
        Thread a = new Thread(new PrintChars('a'));
        Thread b = new Thread(new PrintChars('b'));
        Thread c = new Thread(new PrintChars('c'));
        a.start();
        b.start();
        c.start();
        
        new Thread(new Runnable() {// T - 500, t -> a; 
            @Override
            public void run() {
                Thread t = new Thread(new PrintChars('a'));
                t.start();
                //t.setPriority(10);
                try {
                    for (int i = 1; i <= 500; i++) {
                        System.out.println(i);
                        Thread.yield();
                        t.join();
                    }
                } catch (InterruptedException e) {}
            }
        }).start();
        
        /*ExecutorService executor = Executors.newFixedThreadPool(3);
        //ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(new PrintChars('a'));
        executor.execute(new PrintChars('b'));
        executor.execute(new PrintChars('c'));
        executor.shutdown();
        
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddTenge());
        }
        executor.shutdown();
        while (!executor.isTerminated()) {            
            
        }
        System.out.println("Balance: "+account.getBalance());*/
    }
    private static class AddTenge implements Runnable{

        public void run() {
            synchronized(account){ //blocked all account class 
                account.deposit(1);
            }
        }
    }
    private static class Account{
        //Lock lock = new ReentrantLock();
        private int balance = 0;
        public int getBalance(){
            return balance;
        }
        public /*synchronized*/ void deposit(int amount){ //blocked only deposit method
            //lock.lock();
            int temp = balance + amount;
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
            }
            balance = temp;
            //lock.unlock();
        }
    }
}
