package prp;
import java.util.*;
public class Test6 {

   public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
    char n=sc.next().charAt(0);
   
   
      if((n>='a' && n<='z') || (n>='A' && n<='Z')) {
    	  System.out.println("Alphabets");
      }
      else if(n>=0 && n<=9) {
    	  System.out.println("Digit");
      }
      else {
    	  System.out.println("Special character");
      }
   }
}


