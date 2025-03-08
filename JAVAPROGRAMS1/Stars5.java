class Stars5 
{
	public static void main(String[] args) 
	{
		int rows=5;
		System.out.println("enter the no. of rows: ");
		int starCount=1;
		for (int i=1;i<=rows ;i++ )
		{
			for (int j=1;j<=starCount ;j++ )
			{
				System.out.print("*");
			}
			System.out.println();
			starCount++;
		}
	}
}
