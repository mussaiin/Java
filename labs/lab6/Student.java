
  public static class Student extends Person{
    private double gpa;

    Student(){}

    Student(String s, int n, double d){
      super(s,n);
      gpa = d;
    }

    public void setGpa(double d){gpa=d;}
    public double getGpa(){return gpa;}

    public String toString(){
      return super.toString()+" "+gpa;
    }
  }
