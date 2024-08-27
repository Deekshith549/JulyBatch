	package oopsPack;

public class Dog extends Animal{
	int legs;
	int tail;
	Dog(){
		this.tail=1;
		this.legs=4;
	}
	
	
	Dog(int legs,int tail){
		this.tail=tail;
		this.legs=legs;
	}
	
	void bark() {
        System.out.println("The dog barks.");
    }
	void eat(String t) {
		System.out.println(t+ "dog eats pedigreee");
	}
	
	void eat() {
		System.out.println("dog eats pedigreee");
	}
}
