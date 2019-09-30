import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		long fact=1 , num;
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextLong();
		for(long i= num ; i>=1;i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
}