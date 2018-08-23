import java.util.*;
import java.io.*;
import java.lang.*;

public class Test {
	public static void main(String args[]) throws IllegalTriangleException{
    try{
    Triangle t1 = new Triangle(1.0,1.0,2.0);
		System.out.println(t1);
    }
    catch(IllegalTriangleException e){
      e.printStackTrace();
    }
}
}
