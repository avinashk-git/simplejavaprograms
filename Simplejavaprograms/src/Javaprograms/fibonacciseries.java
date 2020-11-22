package Javaprograms;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input required inorder to print fibonacci number upto
		System.out.println("enter number upto which fibonacci need to be print");
		int number = new Scanner(System.in).nextInt();
		System.out.println("fibonacci series upto" +number +"numbers :");
		
		//printing fibonacci number upto
		
		for(int i =1; i<=number; i++ )
		{
		
			System.out.println(fibonacci2(i) +" ");
		
	}

}

	public static int fibonacci2(int number)
	{
		
		if(number == 1 || number == 2) {
		
			return 1;
		}
		
		int fibo1 = 1, fibo2 = 1 , fibonacci=1;
		for(int i = 3; i<=number; i++)
		{
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
					
		}
		return fibonacci;
	}
	
}
