package com.cg.day3;
import java.util.Scanner; 
public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yr name :");
		String name = sc.nextLine();
		System.out.println("Enter yr age :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter yr email address :");
		String email = sc.nextLine();
		System.out.println("Enter yr phone no :");
		int phone = sc.nextInt();
		 
		System.out.println("yr name is :"+name);
		System.out.println("yr age is :"+age);
		System.out.println("yr email address is :"+email);
		System.out.println("yr phon  no is :"+phone);

	}

}
