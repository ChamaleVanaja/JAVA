import java.util.Scanner;
class  SortDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int sort=0;
		for(int i=1;i<=9;i++)
		{
			int temp=n;
			while (temp!=0)
			{
				int d=temp%10;
				if (i==d)
				{
					sort=sort*10+d;
				}
				temp=temp/10;
			}
		}
		System.out.println(sort);
	}
}
