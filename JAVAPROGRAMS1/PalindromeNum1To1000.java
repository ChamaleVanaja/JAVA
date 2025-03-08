class PalindromeNum1To1000 
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=1000 ;i++ )
		{
			int rev=0;
			int temp=i;
			while (temp!=0)
			{
				int ld=temp%10;
				rev=rev*10+ld;
				temp=temp/10;
			}
			if (rev==i)
			{
			System.out.println(i);
			}	
		}
	}
}
  