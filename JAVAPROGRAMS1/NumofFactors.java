import java.util.Scanner;
class NumofFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE NUM :");
		int n=sc.nextInt();    
		int count=0;
		for (int i=1;i<=n ;i++ )
		{
			if (n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}






