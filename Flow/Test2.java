package Flow;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int num1;
      int num2;
      num1=sc.nextInt();
      num2=sc.nextInt();
      
      
      if((num1%10)==(num2%10)){
    	  System.out.println("true");
      }
      else{
    	  System.out.println("false");
      }
	}

}
