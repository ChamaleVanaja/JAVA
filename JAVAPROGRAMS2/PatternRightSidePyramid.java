class PatternRightSidePyramid
{
	public static void main(String[] args) 
	{
		int rows=9;
		int starcount=1;
		for (int i=1;i<=rows ;i++ )
		{
			for (int j=1;j<=starcount ;j++ )
			{
				System.out.print("*");
			}
			if (i<(rows/2+1))
			{
				starcount++;
			}
			else 
				starcount--;
			System.out.println();
		}
	}
}
