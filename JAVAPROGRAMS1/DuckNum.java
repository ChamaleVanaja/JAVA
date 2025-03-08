import java.util.Scanner;
class DuckNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTYER A NUM");
		int n=sc.nextInt();
		int pro=1;
		while (n!=0)
		{
			int i=n%10;
			pro=pro*i;
			n=n/10;
		}
		if (pro==0)
		{
			System.out.println(n+"is a DuckNUM");
		}
		else
		{
			System.out.println(n+"is not a DuckNUM");
		}
	}
}
