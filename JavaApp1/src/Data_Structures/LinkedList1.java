package Data_Structures;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long time1= System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("Get method:" + (time2-time1));
        
        Iterator<Integer> iter = list.iterator();
        long time3 = System.currentTimeMillis();
        while (iter.hasNext()) {
            iter.next();            
        }
        long time4 = System.currentTimeMillis();
        System.out.println("Iterator:"+(time4-time3));
        
        long time5 = System.currentTimeMillis();
        for (Integer i : list);
        long time6 = System.currentTimeMillis();
        System.out.println("For each Iterator:"+(time6-time5));
        
    }
}
