package oopsPack;

public class Inharitnace {
	
	public static void main(String[] args) {
        Dog dog = new Dog();  // Creating an object of the Dog class

        dog.eat("puppy ");  // Inherited method from Animal class
        dog.bark(); // Method of Dog class
        
        Dog spdog=new Dog(8,2);
        
        System.out.println("spdog has "+spdog.legs+" legs");
        System.out.println("spdog has "+spdog.tail+" tails");
        
        System.out.println("dog has "+dog.legs+" legs");
        System.out.println("dog has "+dog.tail+" tails");
        
//        Animal am=new Animal();
//        am.eat();
        
//        Animal amd=new Dog();
//        amd.eat("puppy");
        
//        Dog dma=new Animal();
//        dma.eat();
    }

}
