package prp;
import java.util.*;
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		   int r;
		   int rev=0;
		   while(n!=0)
		   {
			   r=n%10;
			   rev=rev*10+r;
			   n=n/10;
		   }
		   System.out.println(rev);
		
	}

}
