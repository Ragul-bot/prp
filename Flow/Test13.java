package prp;
import java.util.*;
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=2;i<n;i++) {
			if(n%i==0)
				break;
		}
		if(n==i) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
