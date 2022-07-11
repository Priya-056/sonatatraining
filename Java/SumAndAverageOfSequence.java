package javaexcercise;

import java.util.ArrayList;
import java.util.Scanner;

public class SumAndAverageOfSequence {
	int sum=0;
	public int Sum(ArrayList<Integer> list) {
		for(int d: list) {
			sum+=d;
		}
		return sum;
	}
	public int average(ArrayList<Integer> list) {
		int size= list.size();
		int avg=(sum/size);
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Enter List of numbers: ");
		
		ArrayList<Integer> LIST = new ArrayList<Integer>();
		for(int i=1;i<=5;i++) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			LIST.add(n);
		}
		
		System.out.println("LIST ELEMENTS: "+LIST);
		SumAndAverageOfSequence ob=new SumAndAverageOfSequence();
		System.out.println(ob.Sum(LIST));
		System.out.println(ob.average(LIST));

	}

}
