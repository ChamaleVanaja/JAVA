import java.util.Scanner;
class AutomorpicNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUM");
		int num=sc.nextInt();
		int square=num*num;
		boolean isAutomorpic=true;
		while (num!=0)
		{
			if ((num%10)!=(square%10))
			{
				isAutomorpic=false;
			}
			num=num/10;
			square=square/10;
		}
		if (isAutomorpic)
		{
			System.out.println("Is a Automorpic num");
		}
		else
		{
			System.out.println("Is not a Automorpic num");
		}
	}
}
