class SmallestDigitex02
{
	public static void main(String[] args) 
	{
		int n=5498;
		int sd=9;
		while(n>0)
		{
			int d=n%10;
			if(d<sd)
				sd=d;
			n/=10;
		}
		System.out.println(sd);
	}
}
