import java.util.Scanner;
class Armstrong 
{
	public static void main(String args[])
	{
		int num , sum = 0 , temp , x;
		
		System.out.print("Enter a number to check Armstrong number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num;

		while(num>0)
		{
			x = num % 10;
			num = num / 10;
			sum = sum + (x * x * x);

		}
			if(temp == sum)
			{
				System.out.println( + sum + " is Armstrong Number ");
			}
			else
			{
				System.out.println( + sum + " is not Armstrong Number ");
			}


	}
}