import java.util.Scanner;
class Spynum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TH NUM: ");
		int i=sc.nextInt();
		int sum=0;
		int pro=1;
		while (i!=0)
		{
			int n=i%10;
			sum=sum+n;
			pro=pro*n;
			i=n/10;
		}
		if (sum==pro)
		{
			System.out.println("Is a spy num");
		}
		else 
		{
			System.out.println("Is not a spy num");
		}
	}
}
