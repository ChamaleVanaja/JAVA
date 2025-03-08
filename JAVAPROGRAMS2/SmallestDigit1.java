import java.util.Scanner;
class SmallestDigit1
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int sd=-1;
		for(int i=0;i<=9;i++)
		{
			int temp=n;
			while(temp>0)
			{
				int d=temp%10;
				if(d==i)
				{
					sd=i;
					break;
				}
				temp=temp/10;
			}
			if(sd==i)
				break;
		}
		System.out.println(sd);

	}
}
