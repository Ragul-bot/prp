package Flow;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		int num=sc.nextInt();
		if(num<0){
			System.out.println("negative");
		}
		else if(num>0){
			System.out.println("positive");
		}
		else if(num==0){
			System.out.println("zero");
		}
	}

}
