package Data_Structures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.offer("George");
        q.offer("Jim");
        q.offer("John");
        q.offer("Blake"); 
        q.offer("Kevin");
        q.offer("Michael");
        PriorityQueue q2 = new PriorityQueue(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        Set<String> union = new HashSet<>();
        union.addAll(q);
        System.out.println("Union:"+union.toString());
        union.removeAll(q);
        
        union.addAll(q2);
        System.out.println("Union:"+union.toString());
        
        union.retainAll(q);
        System.out.println("Intersection:"+union.toString());
        union.removeAll(q);
    }
}
