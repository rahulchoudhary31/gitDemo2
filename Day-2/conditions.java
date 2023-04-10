package Pack1;
import java.util.*;

public class conditions {

	public static void main(String[] args) {
		int x,y,z;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three no.");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x<y&&x>z)
		{
		System.out.println("Greatest no.="+x);
		}
		else if(y>x&&y>z)
		{
		System.out.println("Greatest no.="+y);
		}
		else
		{
		System.out.println("Greatest no.="+z);
		}
     
	}

}
