package javaexcercise;

import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Company's Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Company's Address: ");
		String add=sc.nextLine();
		System.out.println("Enter Company's Phone number: ");
		long pno=sc.nextLong();
		System.out.println("Enter Company's FaxNumber: ");
		long fno=sc.nextLong();
		System.out.println("Enter Company's WebSite: ");
		String web=sc.nextLine();
		System.out.println("Enter Company's Manager: ");
		String manager=sc.nextLine();
		System.out.println("Enter Manager's Name: ");
		String mnage=sc.nextLine();
		System.out.println("Enter Manager's SurName: ");
		String msurname=sc.nextLine();
		System.out.println("Enter Manager's PhoneNumber: ");
		long mpno=sc.nextLong();
		System.out.println("Company's Name: "+name);
		System.out.println("Company's Address: "+add);
		System.out.println("Company's PhoneNumber: "+pno);
		System.out.println("Company's FaxNumber: "+fno);
		System.out.println("Company's Website: "+web);
		System.out.println("Company's Manager: "+manager);
		System.out.println("Manager's Name: "+mnage);
		System.out.println("Manager's SurName: "+msurname);
		System.out.println("Manager's PhoneNumber: "+mpno);


	}

}
