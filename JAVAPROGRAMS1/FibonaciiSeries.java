class FibonaciiSeries 
{
	public static void main(String[] args) 
	{
		int a=0,b=1,sum=0;
		for(int i=1;sum<=10;i++)
		{
			System.out.print(sum+",");
			a=b;
			b=sum;
			sum=a+b;
		}
		System.out.println();
	}
}
