public class Test{
    public static void main(String[] args){
      Student s = new Student();
      //s.name = "Samat";
      //s.gpa = 3.2;
      s.setName("Samat");
      s.setGpa(3.2);

      Student s2 = new Student("Aibek", 3.62);
      System.out.println(s.getName()+" "+s.getGpa());
      System.out.println(s2);
    }
}
