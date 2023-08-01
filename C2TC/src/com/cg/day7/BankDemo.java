package com.cg.day7;

public class BankDemo {
	public static void main(String[] args) {
	savingaccount sa =new savingaccount("vidhya","villupuram",101,4567);
	System.out.println(sa);
	sa.deposit(12000);
	System.out.println(sa);
	sa.withdraw(5000);
	System.out.println(sa);
	sa.withdraw(7000);
	System.out.println(sa);
	sa.deposit(5000);
	System.out.println(sa);

}
}
