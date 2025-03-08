import java.util.Scanner;
class SpyNum1 
{
	public static String spy(int n)
	{
		int sum=0;
		int prod=1;
		int temp=n;+-
		while (n!=0)
		{
			int ld=temp%10;
			sum=sum+ld;
			prod=prod*ld;
			temp=temp/10;
		}
			if (sum==prod)
			{
				return "Is a Spy Num";
			}
			else{
				return "Is a Not Spy Num";
			}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER TH NUM TO CHECK THE NUM IS SPY OR NOT: ");
		int n=s.nextInt();
		System.out.println(spy(n));
	}
}
