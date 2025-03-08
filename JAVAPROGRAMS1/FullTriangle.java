class FullTriangle 
{
	public static void main(String[] args) 
	{
		int rows=9;
		int spaceCount=8;
		int starCount=1;
		for (int i=1;i<=rows ;i++ )
		{
			for (int n=1;n<=spaceCount ;n++ )
			{
				System.out.print("   ");
			}
			for (int j=1;j<=starCount ;j++ )
			{
				System.out.print(" * ");
			}
			System.out.println();
			starCount+=2;
			spaceCount--;
		}
	}
}
