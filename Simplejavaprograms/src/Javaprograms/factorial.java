package Javaprograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter any number");
		int number = new Scanner(System.in).nextInt();
		
		
		factorialnumber(number);
		factorial2(number);
		
	}

	
	public static int factorialnumber(int k)
	
	{
		int i=k;
		int t=1;
		
		while (i>1)
		{
			
			t*= i*(i-1);
		    
			i =i-2;
		    
		}
		
		System.out.println(t);
		
		return i;
	}
	
	public static int factorial2(int k)

	{
		int i=1;
		
		while(k!=0)
		{
			
			i=i*k;
			k--;
		}
		
		System.out.println(i);
		return i;
}
}
