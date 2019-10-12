import java.util.Scanner;
class StringPalindrome
{
	public static void main(String args[])
	{
        
		String value,value2, rem="";
		System.out.println("Enter a value for check the palindrome : ");
		Scanner sc = new Scanner(System.in);
		value = sc.nextLine();
                value2=value;
		int length = value.length();
		for(int i=length-1 ; i>=0 ; i--)
		{
			rem = rem + value.charAt(i);
		}


		if(value.equals(rem))
		{
			System.out.println(rem +" is palindrome number");
		}
		else
		{
			System.out.println( rem + " is not palindrome number");
		}
	}
}