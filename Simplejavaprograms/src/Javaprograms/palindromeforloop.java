package Javaprograms;

import java.util.Scanner;

public class palindromeforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     Scanner sc = new Scanner(System.in);
     
     System.out.println("enter a string");
     
     String st1 = new String();
     
     st1= sc.next();
     
StringBuilder sb = new StringBuilder(st1);

reversestring(sb);
	
	System.out.println(sb);
	}

	
	public static String reversestring(StringBuilder sc)
	
	{
		// convert to string
		
		String sd= sc.toString();
	
		System.out.println("inside function");
		
		char[] c = sd.toCharArray();
		
		StringBuilder se = new StringBuilder();
		for (int i=sc.length()-1;i>=0;i--)
			
		{
			se.append(c[i]);
			
		}
		
		String sf= se.toString();
		
		System.out.println(sf);
		
		return sf;
	}
	
}
