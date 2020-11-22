package Javaprograms;

import java.util.Scanner;
public class palindromenumberwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("enter any number");
		
		int number = new Scanner(System.in).nextInt();
		
		if(ispalindrome(number))
		{
			System.out.println("inside main function is a palindrome number");
		}
		else
		{
		System.out.println("inside main function not a palindrome number");
	}}

	public static boolean ispalindrome(int palindrome)
	
	{
		int number=palindrome;
		
		int reverse= 0;
		
		while(number!=0) {
			
			int reminder = number%10;
			
			reverse = reverse*10+reminder;
			
			number = number/10;
		}
		
		System.out.println(+reverse);
		
		if (palindrome==reverse)
		{
			System.out.println("is a palindrome number");
			return true;
		}
		
		System.out.println("not a palindrome number");
		return false;	
		
		
	}
	
}
