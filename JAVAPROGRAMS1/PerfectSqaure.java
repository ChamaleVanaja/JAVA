class PerfectSqaure 
{
	public static void main(String[] args) 
	{
		int n=30;
		boolean isItPerfectSqaure=false;
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				isItPerfectSqaure=true;
				break;
			}
		}
		if(isItPerfectSqaure)	
			System.out.println("perfect sqaure");
		else
			System.out.println("not perfect sqaure");
	}
}
