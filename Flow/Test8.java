package prp;
import java.util.*;
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toString();
		char word=s.charAt(0);
		if(word>=65 && word<90) {
			System.out.println(Character.toLowerCase(word));
		}
		else {
			System.out.println(Character.toUpperCase(word));
		}
	}

}
