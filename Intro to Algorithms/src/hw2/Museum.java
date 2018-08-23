package hw2;
import java.util.*; 
public class Museum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        input.nextLine();
        int[]x = new int[a*2];
        int[]y = new int[a];
        int[]z = new int[a];
        for(int i = 0; i < a; i++){
            String s = input.nextLine();
            String []b = s.split(" ");
            String []c = b[0].split(":");
            String []d = b[1].split(":");
            System.out.println(b[i]);
            int f = Integer.parseInt(c[0])*60+Integer.parseInt(c[1]);
            int h = Integer.parseInt(d[0])*60+Integer.parseInt(d[1]);
            z[i] = f; y[i] = h; 
        }
        int []t = new int[a*2];
        for(int i = 0; i < a; i++){
            t[i] = z[i];
            t[a+i] = y[i];
        }
        Arrays.sort(t);
        for(int i = 0; i < a*2; i++){
            for(int j = 0; j < a; j++){
                if(t[i]==z[j]) x[i] = j;
                else if(t[i]==y[j]) x[i] = j;
            }
        }
        int m=0;
        int temp=0;
        int []k = new int[a*2];
        for(int i = 0; i < a*2; i++){
            k[i]=-1;
        }
        for(int i = 0; i < 2*a; i++){
            for(int j = 0; j < a; j++){
                if(k[j]==x[i]){
                    if(m < temp) {m = temp;}
                    temp = temp-2;
                }
            }
            temp = temp+1;
            k[i] = x[i];
        }
        System.out.println(m);
        
    }
}
