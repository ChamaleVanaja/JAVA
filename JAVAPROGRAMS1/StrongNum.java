import java.util.Scanner;
class StrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while (temp!=0)
		{
			int ld=temp%10;
			int prod=1;
			for (int i=1;i<=ld ;i++ )
			{
				prod=prod*i;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if (n==sum)
		{
			System.out.println(n+" is a Strong num");
		}
		else{
			System.out.println(n+" is not a Strong num");
		}
	}
}
