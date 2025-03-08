import java.util.*;
class AscendingOrder
{
	public static int sorting(int n)
	{
		int sort=0;
		for (int i=1;i<=9 ;i++ )
		{
			int t=n;
			while (t!=0)
			{
				if (i==t%10)
				{
					sort=sort*10+(t%10);
				}
				t=t/10;
			}
		}
		return sort;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(sorting(n));
	}
}
