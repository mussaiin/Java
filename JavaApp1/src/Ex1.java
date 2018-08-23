
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;


public class Ex1{
    public static void main(String[] args) {
        /*
        GenericStack<Integer> s = new GenericStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(1);
        s.push(2);
        s.push(5);
        s.push(6);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        s.push(7);
        System.out.println(s.toString());
        System.out.println(s.getSize());
        */
        ArrayList<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        a.add("B");
        a.add("C");
        a.add("D");
        a.add("A");
        System.out.println(a.toString());
        a=removeDuplicates(a);
        System.out.println(a.toString());
        String [] strings = {"New York", "Astana", "Almaty", "Kokshetau"};
        System.out.println(max(strings));
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for(int i=1; i<list.length; i++){
            if(max.compareTo(list[i]) < 0) max=list[i];
        }
        return max;
    }
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        /*
        Set<E> set = new HashSet<E>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
        */
        
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j)))
                    list.remove(j--);
            }
        }
        return list;
    }
 }
