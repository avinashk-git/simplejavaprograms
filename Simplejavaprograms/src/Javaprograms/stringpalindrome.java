package Javaprograms;

import java.util.Scanner;

public class stringpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc= new String();
		
		System.out.println("enter any string");
		
		abc= new Scanner(System.in).next();
		
		StringBuilder sb1= new StringBuilder(abc);
		
	System.out.println(abc);
	
	System.out.println(reversestring(sb1));
	
	if (abc.contentEquals(sb1))
	{
		System.out.println("its a palindrome");
	}
	
	else
		{
		System.out.println("not a palindrome");
		}
	
	
	}
	
	public static StringBuilder reversestring(StringBuilder rs)
	{
	
		StringBuilder sb= new StringBuilder(rs);
		
		sb.reverse();
		
		StringBuilder newstr= new StringBuilder(sb);
		
		return newstr;
	}
}

