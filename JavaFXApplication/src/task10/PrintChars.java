package task10;

import javafx.scene.control.TextArea;

 public class PrintChars implements Runnable {
        char c;
        TextArea txt;
        int t;
        public PrintChars(char c, TextArea txt, int t) {
            this.c = c;
            this.txt = txt;
            this.t = t;
        }
        public synchronized void run() {
            for (int i = 0; i < t; i++) {
                synchronized (txt) {
                    txt.appendText(c + "");
//                    Thread.yield();
                }
            }

        }

    }
