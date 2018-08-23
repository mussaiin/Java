  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author Nurlybek
 */
public class Task3 {
    private static Account account = new Account();
    public static void main(String[] args) {
        
    ExecutorService executor = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 1000; i++) {
            executor.execute(new AddTenge());
        }
        executor.shutdown();
        while (!executor.isTerminated()) {            
            
        }
        System.out.println("Balance: "+account.getBalance());
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
