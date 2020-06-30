package prp;
import java.util.*;
public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum;
		int n=sc.nextInt();
		for( sum=0;n!=0;n/=10) {
			sum+=n%10;
		}
		System.out.println("Digit sum="+sum);
	}

}
