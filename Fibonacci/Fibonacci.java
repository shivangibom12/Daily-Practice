import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
		int num ,fibo = 0;
		System.out.print("Enter a number :") ;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int n1=0;
		int n2=1;
		if(num == 0)
		{
			return;
		}
		else if(num == 1) 
		{
			System.out.println(0);
		}
		else
		{
			System.out.println(n1);
			System.out.println(n2);
		}
		for(int i=2;i<num;i++)
		{
			fibo = n1 + n2;
			n1 = n2;
			n2 = fibo;
			
			System.out.println(fibo);
		}
		
	}
}