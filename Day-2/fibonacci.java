package Pack1;
import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,n,i;

		System.out.println("How many terms you want in series");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.print(n1+"\t"+n2+"\t");
		for(i=1;i<=n-2;i++)
		{
		n3=n1+n2;
		System.out.print(n3+"\t");
		n1=n2;
		n2=n3;
		}
	}

}
