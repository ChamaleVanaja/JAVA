class PirmeNum1to100 
{
	public static void main(String[] args) 
	{
		for (int n=1;n<=100 ;n++ )
		{
			boolean isPrime = true;
			for (int i=2;i<n;i++ )
			{
				if (n%i==0)
				{
					isPrime=false;
				}
			}
			if (isPrime)
			{
				System.out.println(n);
			}
		}
	}
}
