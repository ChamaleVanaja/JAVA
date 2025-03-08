import java.util.Scanner;
class SumOfNumInRange 
{
	public static int sumOfNum(int a,int b){
		if (a>b)
		{
			return 0;
		}
		else{
			return a+sumOfNum(a+1,b);
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		System.out.println(sumOfNum(start,end));
	}
}
