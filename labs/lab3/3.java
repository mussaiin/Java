import java.util.Scanner;

class Variables {
    public static void main(String[] args){
      Scanner in = new Scanner (System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int n[][] = new int[a][b];
      int k=1;
      for(int i=0; i<a; i++){
        for (int j=0; j<b; j++) {
          n[i][j]=k++;
          System.out.print(n[i][j]+" ");
        }
        System.out.println();
      }

        /*int a[] = new int[3];
        a[0]=3;
        a[1]=7;
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        String s[]= new String[2];
        s[0]="asd";
        for (String i : s) {
          System.out.println(i);
        }

        Object b[] = {3, "text", 5.4, '%'};
        for (Object o : b) {
          System.out.println(o);
        }

        int c[][]=new int[4][3];
        c[0][2]=4; c[2][1]=8;
        for (int i=0; i<4; i++) {
          for (int j=0; j<3; j++) {
              System.out.print(c[i][j]+" ");
          }
          System.out.println();
        }
        */

    }
}
