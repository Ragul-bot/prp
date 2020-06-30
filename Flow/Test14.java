package prp;
import java.util.*;
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=10;i<99;i++)
		{
			boolean flag=true;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				
				}
			}
				if (flag==true)
				{
					System.out.println(i);
					break;
				}
			}
		
	}

}
