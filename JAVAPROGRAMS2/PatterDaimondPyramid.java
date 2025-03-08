import java.util.Scanner;
class PatterDaimondPyramid 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Num of Rows: ");
		int rows=s.nextInt();
		int starcount=1;
		int spacecount=rows/2;
		for (int i=1;i<=rows ;i++ )
		{
			for (int a=1;a<=spacecount ;a++ )
			{
				System.out.print(" ");
			}
			for (int b=1;b<=starcount ;b++ )
			{
				System.out.print("*");
			}
			if (i<(rows/2+1))
			{
				spacecount--;
				starcount+=2;
			}
			else
			{
				spacecount++;
				starcount-=2;
			}
			System.out.println();
		}
	}
}
