class HarshadNumber 
{
	public static void main(String[] args) 
	{
		int n=81;
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			sum=sum+(temp%10);
			temp/=10;
		}
		if(n%sum==0)
		System.out.println("Harshad number");
	}
}
