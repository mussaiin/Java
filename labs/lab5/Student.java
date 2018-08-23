public class Student {
    private String name;
    private double gpa;
    private static int id=0;
    //like __init__
    public Student(String n, double g){
      name=n;
      gpa=g;
      this.id=id;
      id++;
    }

    //2nd __init__ to work with s.name=...
    public Student(){this.id=id;id++;}

    //like __str__
    public String toString(){
      return name+" has "+gpa+" gpa. id: " +id;
    }

    //setters and getters
    public String getName(){return name;}
    public void setName(String s){name=s;}
    public double getGpa(){return gpa;}
    public void setGpa(double s){gpa=s;}
    public int getId(){
      return this.id;
    }
}
