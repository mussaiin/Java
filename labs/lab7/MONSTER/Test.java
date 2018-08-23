class Test{
  public static void main(String [] args){
    Monster m1 = new LightningMonster("Nurbek");
    Monster m2 = new WaterMonster("Aziza");
    Monster m3 = new FireMonster("Kanat");

    System.out.println(m1.attack());
    System.out.println(m2.attack());
    System.out.println(m3.attack());
    System.out.println(m3.getHealth());

    Object []a = {new Integer(1), new String("some text"), new FireMonster("Asd")};
    for(Object i : a){
      System.out.println(i);
    }
  }
}
