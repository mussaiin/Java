public class MyComplex {
    double real = 0.0;
    double imag = 0.0;

    public MyComplex(double r, double i){real = r; imag = i;}
    //2nd __init__ to work with s.name=...
    public MyComplex(){}
    //like __str__
    public void setReal(double r){real = r;}
    public double getReal(){return real;}

    public void setImag(double i){imag = i;}
    public double getImag(){return imag;}

    public void setValue(double r, double i){real = r; imag = i;}

    public String toString(){
      return real+"+"+imag+"i";
    }

    public boolean isReal(){
      return (imag == 0);
    }

    public boolean isImag(){
      return (real == 0);
    }

    public boolean equals(double r, double i){
      return (this.real == r && this.imag == i);
    }

    public boolean equals(MyComplex x){
      return (this.real == x.real && this.imag == x.imag);
    }

    public double magnitude(){
      return Math.sqrt(real*real + imag*imag);
    }

    public double argument(){
      return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex another){
        real=this.real+another.real;
        imag=this.imag+another.imag;
        return new MyComplex(real, imag);
    }
    public MyComplex substract(MyComplex another){
        real=this.real-another.real;
        imag=this.imag-another.imag;
        return new MyComplex(real, imag);
    }
    public MyComplex addNew(MyComplex another){
        double real=this.real+another.real;
        double imag=this.imag+another.imag;
        return new MyComplex(real, imag);
    }
    public MyComplex subNew(MyComplex another){
        double real=this.real-another.real;
        double imag=this.imag-another.imag;
        return new MyComplex(real, imag);
    }
    public MyComplex multiply(MyComplex another){
        real=this.real*another.real - this.imag*another.imag;
        imag=this.real*another.imag - this.imag*another.real;
        return new MyComplex(real, imag);
    }
    public MyComplex divide(MyComplex another){
        real=this.real/another.real;
        imag=this.imag*another.imag;
        return new MyComplex(real, imag);
    }
    public MyComplex conjugate(){
      return new MyComplex(real, -imag);
    }

}
