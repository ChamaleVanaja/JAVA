class ProOfNum 
{
	public static void main(String[] args) 
	{
		int n=456;
		int pro=1;
		while (n!=0)
		{
			int i=n%10;
			pro=pro*i;
			n=n/10;
		}
		System.out.println(pro);
	}
}
