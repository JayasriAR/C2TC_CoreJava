package Inheritance;

public class Childclass2 extends Childclass {
	void bark() {
		System.out.println("Barking!!!!");
	}

	public static void main(String[] args) {
       Childclass2 ob1 = new Childclass2();
       ob1.eat();
       ob1.meow();
       ob1.bark();
       
       
	}

}
