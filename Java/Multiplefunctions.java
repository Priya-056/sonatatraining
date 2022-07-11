package javaexcercise;

import java.util.Scanner;

public class Multiplefunctions {

	
	int sum,rem,rev=0;
	int digit;
	public int sumOfDigits(int num) {
		
		while(num > 0)  
		{  
			
		//finds the last digit of the given number    
		digit = num % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		num = num / 10;  
		}
		
		return sum;  
		
	}
	
	public int reverse(int num) {
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	
	public String lastDigitInFirst(int num) {
		
			rem=num%10; //holds last digit
			num=num/10; //holds first three digit
			String firstthree=String.valueOf(num);
			String last=String.valueOf(rem);
		
		return last+firstthree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num=sc.nextInt();
		Multiplefunctions ob=new Multiplefunctions();
		System.out.println("Sum of Digits of "+num+" is: "+ob.sumOfDigits(num));
		System.out.println("Reverse of "+num+" is: "+ob.reverse(num));
		System.out.println("Last digit to first "+num+" is: "+ob.lastDigitInFirst(num));

	}

}

