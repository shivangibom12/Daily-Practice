import java.util.Scanner;
class IntegerPalindrome
{
	public static void main(String args[])
	{
		int num ,rem , sum=0 ,temp;
		System.out.print("Enter a number for checking Palindrome : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
                temp = num ;

		while( num != 0)
		{
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}

		if(temp == sum)
		{
			System.out.println( + sum + " is palindrome number");
		}
		else
		{
			System.out.println(+ sum + " is not palindrome number");
		}

	}		
}