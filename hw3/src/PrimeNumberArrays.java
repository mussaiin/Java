import java.util.*;
/**
 *
 * @author zharas
 */
public class PrimeNumberArrays{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int arr[] = new int[1000];
        boolean prime = false;
        int divider=0;
        int index=0;
        
        System.out.print("2 ");
        System.out.print("3 ");
        System.out.print("5 ");
        System.out.print("7 ");
        
        for(int i=10; i<arr.length; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    divider++;
                }
            }
            if(divider==0){
                arr[index]=i;
                index++;
            }
            divider=0;
        }
        
        for(int i=0; i<index; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

