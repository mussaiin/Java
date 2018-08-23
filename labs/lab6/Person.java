public class Person {
    private String name;
    private int age;

    public Person(String n, int g){
      name=n;
      age=g;
    }

    //2nd __init__ to work with s.name=...
    public Person(){}

    //like __str__
    public String toString(){
      return name+" "+age;
    }

    //setters and getters
    public String getName(){return name;}
    public void setName(String s){name=s;}
    public int getAge(){return age;}
    public void setAge(int s){age=s;}
}
