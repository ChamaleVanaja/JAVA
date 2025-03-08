class Humanex01 
{
	public static String sujathaAunt(String food)
	{
		System.out.println("nicely eat "+food);
		return "laddo";

	}
	public static void main(String[] args) 
	{
		//returned data can be directly printed
		System.out.println(sujathaAunt("biryani"));

		//returned data can be stored and used
		String fridge=sujathaAunt("ice cream");
		System.out.println(fridge);

		//returned data can be used as a condition
		if(sujathaAunt("cake")=="laddo")
			System.out.println("murder sujatha aunt");

	}
}
