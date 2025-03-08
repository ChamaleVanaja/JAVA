class DigitsDescending 
{
	public static void main(String[] args) 
	{
		int n=5201314;
		int sortN=0;
		for(int i=9;i>=0;i--)
		{
			int temp=n;
			while(temp!=0)
			{
				int ld=temp%10;
				if(ld==i)
					sortN=sortN*10+ld;
				temp/=10;
			}
		}
		System.out.println("The given Number sorted in Descending order is:"+sortN);
	}
}
