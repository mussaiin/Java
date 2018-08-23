public class Account {
    String id;
    String name;
    int balance = 0;


    public Account(String i, String n){id=i; name=n;}
    public Account(String i, String n, int blnc){id=i; name=n; balance = blnc;}

    //2nd __init__ to work with s.name=...
    public Account(){}
    //like __str__
    public String toString(){
      return "id: "+id+" name: "+name+" balance: "+balance;
    }

    public String getID(){return id;}
    public String getName(){return name;}
    public int getBalance(){return balance;}
    public int credit(int amount){
      return balance += amount;
    }
    public int debit(int amount){
      if(amount<=balance){
        balance = balance - amount;
      }
      else{
        System.out.println("Amount exceeded balance");
      }
      return balance;
    }
    public int transferTo(Account x, int amount){
      if(amount<=balance){
        balance = balance - amount;
        x.credit(amount);
      }
      else{
        System.out.println("Amount exceeded balance");
      }
      return x.balance;
    }

}
