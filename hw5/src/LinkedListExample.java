import java.util.*;  

    class Cars {  
int id;  
String mark,company,manufacturer;  
int quantity;  

    public Cars(int id, String mark, String company, String manufacturer, int quantity) {  
    this.id = id;  
    this.mark = mark;  
    this.company = company;  
    this.manufacturer = manufacturer;  
    this.quantity = quantity;  
    }  
}  
    public class LinkedListExample {  
        public static void main(String[] args) { 
            long startTime = System.currentTimeMillis();
            Runtime rt = Runtime.getRuntime();
            long total = rt.totalMemory();
            long free = rt.freeMemory();
            long used = total - free;

            List<Cars> list=new LinkedList<Cars>();  
            Cars c1=new Cars(1,"X5","BMW","Germany",8);  
            Cars c2=new Cars(2,"Corolla","Toyota","Japan",4);  
            Cars c3=new Cars(3,"RX350","Lexus","Japan",6);  
            list.add(c1);  
            list.add(c2);  
            list.add(c3);  
    
    
            System.out.println("Before update: ");
            for(Cars c:list){
                System.out.println(c.id +" "+ c.mark + " " + c.company + " " + c.manufacturer + " "+ c.quantity);
            }

            list.remove(c1);
            System.out.println("\nAfter update: ");
                for(Cars c:list){
                System.out.println(c.id + " " + c.mark + " " + c.company + " " + c.manufacturer + " " +c.quantity);
            }

                long endTime = System.currentTimeMillis();
                long actualTime = endTime - startTime;

                System.out.println("\nMemory for execution: " + used);
                System.out.println("Time for execution: " + actualTime);

    }  
}  