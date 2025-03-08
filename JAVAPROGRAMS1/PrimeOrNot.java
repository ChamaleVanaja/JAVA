import java.util.Scanner;
class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a num :");
		int n=sc.nextInt();
		boolean isPrime=true;
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
				isPrime=false;
			}
		}
		if (isPrime)
		{
			System.out.print(n+"is a prime no.");

		}
		else
		{
			System.out.print(n+"is not a prime no.");
		}
	}
}
