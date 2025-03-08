class rightAngleTriangle 
{
	public static void main(String[] args) 
	{
		int rows=5;
		int starCount=1;
		int spaceCount=4;
		for (int i=1;i<=rows ;i++ )
		{
			for (int n=1;n<=spaceCount ;n++ )
			{
				System.out.print(" ");
			}
			for (int j=1;j<=starCount ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
			starCount++;
			spaceCount--;
		}

	}
}
