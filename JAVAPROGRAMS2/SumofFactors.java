import java.util.Scanner;
class SumofFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE NUM: ");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
