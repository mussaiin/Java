public class Test{
  public static void main(String [] args){
    Account n = new Account("1", "Mansur", 100);
    n.credit(200);
    System.out.println(n);
    Account n1 = new Account("2", "Nurbek", 100);
    n1.debit(100);
    System.out.println(n1);
    n.transferTo(n1, 100);
    System.out.println(n);
    System.out.println(n1);
  }
}
