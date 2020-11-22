package Javaprograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number");
		
		int number = new Scanner(System.in).nextInt();
		
		
		//	System.out.println("the number is" +isprime(number));
			
			if(isprime(number)== false)
			{
				System.out.println(+number +" " +"not a prime number");
				
			}
			else
			{
				System.out.println(+number +" " +"prime number");
			}
			
	}

	public static boolean isprime(int number)
	{
		
	
		for(int i=2;i<number;i++)
		{
			
			if(number%i == 0)
				
			{
             return false;
            }
		}
		
		
		return true;
		}
	}
