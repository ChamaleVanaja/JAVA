import java.util.Scanner;
class StrongNumForLoop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for (int temp=n;temp!=0 ;temp=temp/10 )
		{
			int ld=temp%10;
			int prod=1;
			for (int i=1;i<=ld ;i++ )
			{
				prod=prod*i;
			}
			sum=sum+prod;
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
