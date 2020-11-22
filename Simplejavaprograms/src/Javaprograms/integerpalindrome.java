package Javaprograms;

import java.util.Scanner;

public class integerpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Enter any number");
	
		int i = new Scanner(System.in).nextInt();
		

		ispalindromenumber(i);
	}
		
		public static int ispalindromenumber(int j)
		{
			
	Integer k = new Integer(j);
	
	String s=k.toString();
	
	StringBuilder sk = new StringBuilder(s);
	
	
	System.out.println(sk);
	
StringBuilder sb = new StringBuilder(s);

sb.reverse();

System.out.println(sb);	

if (sb.equals(sk))
	
{
	System.out.println("palindrome number");
}
			
else 
{
	System.out.println("not a palindrome number");
}
			return j;
			
			
		}
	
	}


