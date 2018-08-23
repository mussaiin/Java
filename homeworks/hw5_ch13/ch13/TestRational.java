import java.util.Scanner;
public class TestRational{
	public static void main(String[]args){

		String[] str = (args[0].replaceAll(" ", "/")).split("/");


		Rational r1 =new Rational(Integer.parseInt(str[0]),Integer.parseInt(str[1]));
		Rational r2 =new Rational(Integer.parseInt(str[3]),Integer.parseInt(str[4]));

		switch(str[2])
		{
			case "+": System.out.println(str[0]+"/"+str[1]+" "+"+"+" "+str[3]+"/"+str[4]+" = "+r1.add(r2));
				break;
			case "-":	System.out.println(str[0]+"/"+str[1]+" "+"-"+" "+str[3]+"/"+str[4]+" = "+ r1.subtract(r2));
				break;
			case "*": System.out.println(str[0]+"/"+str[1]+" "+"*"+" "+str[3]+"/"+str[4]+" = "+ r1.multiply(r2));
				break;
			case "/": System.out.println(str[0]+"/"+str[1]+" "+"/"+" "+str[3]+"/"+str[4]+" = "+ r1.divide(r2));
				break;

		}
	}
}
