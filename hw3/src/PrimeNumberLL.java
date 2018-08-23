import java.util.LinkedList;

/**
 *
 * @author zharas
 */
public class PrimeNumberLL{
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<Integer> num = new LinkedList<Integer>();
        int n = num.size();
        int index=0;
        int div=0;
        
        System.out.print("2 3 5 7 ");
        
        
        for(int i=10; i<1000; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    div++;
                }
            }
            if(div==0){
                num.add(index, i);
                index++;
            }
            div=0;
        }
        
        for(int i=0; i<index; i++){
            System.out.print(num.get(i) + " ");
        }
    }
}