import java.util.Scanner;
class FactorsofNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUM: ");
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<=n ;i++ )
		{
			if (n%i==0)
			{
				count++;
				System.out.println(i);
			}
		}
			System.out.println(count);
	}
}
