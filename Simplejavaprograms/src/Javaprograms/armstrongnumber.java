package Javaprograms;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter any number");
		int number = new Scanner(System.in).nextInt();
		
		checkarmstrongnumber(number);
	}

	
	public static boolean checkarmstrongnumber(int armstrong)
	
	{
	int reminder;
	int x=0;
	int y;
	int number = armstrong;
		
	while(number!=0)
		
	{
		
		reminder= number%10;
		
		x+=reminder*reminder*reminder;
		
		//x += Math.pow(reminder,3);  alternate to above line
		
		y=number/10;
		
		number=y;
		
		//number /=10;  alternate to above two lines
	}
		
	System.out.println(+x);
		return true;
	}
}
