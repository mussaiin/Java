import java.util.*;
import java.io.*;
import java.lang.*;

public class Test{
  public static void main(String [] args){
    Object [] ob = { new Chicken(), new Lion(), new Apple()};
    for(Object o : ob){
      if(o instanceof Edible){
        System.out.println(((Edible)o).howToEat());
      }
      if(o instanceof Animal){
        System.out.println(((Animal)o).sound());
      }
    }
  }
}
