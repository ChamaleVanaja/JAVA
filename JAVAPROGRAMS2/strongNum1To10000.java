class  strongNum1To10000
{
	public static void main(String[] args) 
	{
		for (int j=1;j<=100000 ;j++ )
		{
			int temp=j;
			int sum=0;
			while (temp!=0)
			{
			int ld=temp%10;
			int prod=1;
			for (int i=1;i<=ld ;i++ )
			{
				prod=prod*i;
			}
			sum=sum+prod;
			temp=temp/10;
			}
			if (j==sum)
			{
			System.out.println(j);
			}
			  
		}
	}
}
