package Pack1;
import java.util.*;

public class condition2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println("Enter the coordinates");
		
		if(x>0&&y>0)
		{
		System.out.println("point lies in first quadrant");
		}
		else if(x<0&&y>0)
		{
		System.out.println("point lies in second quadrant");
		}
		else if(x<0&&y<0)
		{
		System.out.println("point lies in third quadrant");
		}
		else if(x>0&&y<0)
		{
		System.out.println("point lies in fourth quadrant");
		}
		else if(x==0 && y==0)
		{
		System.out.println("point lies at origin");
		}
		else 
		{
		 System.out.println("the point lies either on x-axis or y-axis ");
		}
	}

}
