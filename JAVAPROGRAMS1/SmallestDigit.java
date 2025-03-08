class SmallestDigit 
{
	public static void main(String[] args) 
	{
		int n=545679;
		for (int i=1;i<=9 ;i++ )
		{
			int t=n;
			while (t!=0)
			{
				if (i==t%10)
				{
					System.out.println(i);
					break;
				}
				t=t/10;
			}
		}
	}
}
