import java.util.Scanner;
class ReverseofNum  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE  NUM");
		int n=sc.nextInt();
		int rev=0;
		while (n!=0)
		{
			int ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		System.out.println(rev);
	}
}
