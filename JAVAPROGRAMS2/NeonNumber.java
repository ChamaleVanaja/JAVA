class NeonNumber 
{
	public static void main(String[] args) 
	{
		int n=9;
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			int d=sq%10;
			sum=sum+d;
			sq=sq/10;
		}
		if(sum==n)
		System.out.println("neon number");

	}
}
