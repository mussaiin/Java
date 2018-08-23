import java.util.Scanner;

class Methods {
    public static void main(String[] args){
      /*System.out.println(AplusB(4, 5));
      System.out.println(AdoubleplusB(4.5, 3.5));
      System.out.println(Divisible(35));
      System.out.println(Divisible(2));*/
      int a[]={1,2,3,4,5,6,7,8};
      System.out.println(InsideArray(a, 1));
    }
    public static int InsideArray(int a[], int n){
      for(int i=0; i<a.length; i++){
        if(a[i]==n){
           return i;
        }
      }
      return -1;
      }

/*
    public static boolean Divisible(int a){
      if(a%5==0 || a%7==0){
        return true;
      }
      else{
        return false;
      }
    }
    public static int AplusB(int a, int b){
      return a+b;
    }
    public static double AdoubleplusB(double a, double b){
      return a+b;
    }
*/
}
