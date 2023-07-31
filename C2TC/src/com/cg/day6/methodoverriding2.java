package com.cg.day6;

public class methodoverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		Dog b;
		Cow i;
		
		a = new Animal();
		a.eat();
		a=new Dog();
		a.eat();
		
		i=new Cow();
		a.eat();

	}

}
