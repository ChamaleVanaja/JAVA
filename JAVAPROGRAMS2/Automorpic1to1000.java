import java.util.Scanner;
class Automorpic1to1000 
{
	public static void main(String[] args) 
	{
		
		for (int num=1;num<=1000 ;num++ )
		{
			int temp=num;
			int square=temp*temp;
			boolean isAutomorpic=true;
			while (temp!=0)
			{
				if ((temp%10)!=(square%10))
				{
					isAutomorpic=false;
				}
				temp=temp/10;
				square=square/10;
			}
			if (isAutomorpic)
			{
				System.out.println(num);
			}
		
		}
	}
}
