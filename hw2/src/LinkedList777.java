import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//FROM KAIRAT ZHARAS 2EN03F

public class LinkedList777 {
    
    public static void main(String[] args) {
        
        String a = "girl";
        String b = "boy";
        String d = "Kairat Zharas";
        int index;
        LinkedList<String> list = new LinkedList<String>();
        LinkedList<String> listgirls = new LinkedList<String>();
        //Iterator<String> iterator = list.iterator();
        int size = list.size();
        list.add("Kairat Zharas - boy");
        list.add("Mashpiyev Nurzhan - boy");
        list.add("Sarsenov Nurs - boy");
        list.add("Baltabay Nurs - boy");
        list.add("Bakytzhan Zhako - boy");
        list.add("Kazhiyev Joha - boy");
        list.add("Alibekuly Sherkhan - boy");
        list.add("Askarbekova Laura - girl");
        list.add("Otegen Fatima - girl");
        list.add("Tolenbekova Sandu - girl");
        list.add("Zhumanova Zho - girl");
        list.add("Nurdauletova Marzhan - girl");
        
        
        Collections.sort(list);
        System.out.println("This is a: " + list);
        
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            index = list.lastIndexOf(s);
            if (s.contains(b)) {
                iterator.remove();
            }
        }
        Collections.sort(list);
        list.addLast("Kairat Zharas - boy");
        list.addLast("Mashpiyev Nurzhan - boy");
        list.addLast("Sarsenov Nurs - boy");
        list.addLast("Baltabay Nurs - boy");
        list.addLast("Bakytzhan Zhako - boy");
        list.addLast("Kazhiyev Joha - boy");
        list.addLast("Alibekuly Sherkhan - boy");
        System.out.println("This is b: " + list);
        
        
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            index = list.lastIndexOf(s);
            if (s.contains(a)) {
                iterator.remove();
            }
        }
        Collections.sort(list);
        list.addLast("Askarbekova Laura - girl");
        list.addLast("Otegen Fatima - girl");
        list.addLast("Tolenbekova Sandu - girl");
        list.addLast("Zhumanova Zho - girl");
        list.addLast("Nurdauletova Marzhan - girl");
        System.out.println("This is c: " + list);
        
        
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            index = list.lastIndexOf(s);
            if (s.contains(d)) {
                iterator.remove();
            }
            
        }
        Collections.sort(list);
        System.out.println("This is d: " + list);
        
    }
}