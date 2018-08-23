package task10;

import javafx.scene.control.TextArea;
public class PrintNums implements Runnable {
        int t;
        TextArea txt;
        public PrintNums(int t, TextArea txt) {
            this.t = t;
            this.txt=txt;
        }
        public synchronized void run(){
            for (int i = 1; i <= t; i++) {
                synchronized (txt) {
                    txt.appendText(" " + i);
//                    Thread.yield();
                }

            }

        }
    }
