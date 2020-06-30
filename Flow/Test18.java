package prp;
import java.util.*;
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		int rem;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(n==rev)
		{
			System.out.println(n+ "is a Palindrome");
		}
		else
			
		{
			System.out.println(n+ "is not a Palindrome");
		}

	}

}
