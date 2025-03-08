import java.util.Scanner;
class BounctNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=54531;
		boolean isIncreasing=true;
		boolean isDecreasing=true;
		while(n!=0)
		{
			int ld1=n%10;
			n=n/10;
			int ld2=n%10;
			if(ld1>ld2)
			{
				isIncreasing=false;
			}
			if(ld1<ld2)
			{
				isDecreasing=false;
			}
		}
		if(isIncreasing ==false && isDecreasing ==false)
		{
			System.out.println("bouncy number");
		}

	}
}
