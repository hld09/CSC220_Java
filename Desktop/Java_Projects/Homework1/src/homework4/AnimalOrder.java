package homework4;

public class AnimalOrder {
    public void Animal() {
        System.out.println("A new animal has been created!");
    }
     
    public void sleep() {
        System.out.println("An animal sleeps...");
    }
     
    public void eat() {
        System.out.println("An animal eats...");
    }
	
    public class Dog extends AnimalOrder {
	    public Dog() {
	        super();
	        System.out.println("A new dog has been created!");
	        
	    }
	    
	    public void bark(){
		     System.out.println("Woof! Woof!");
		        
	    }
	     
	    @Override
	    public void sleep() {
	        System.out.println("A dog sleeps...");
	    }
	     
	    @Override
	    public void eat() {
	        System.out.println("A dog eats...");
	    }
	}
	public class Whale extends AnimalOrder {
	    public Whale() {
	        super();
	        System.out.println("A new whale has been created!");
	    }
	     
	    @Override
	    public void sleep() {
	        System.out.println("A whale sleeps...");
	    }
	     
	    @Override
	    public void eat() {
	        System.out.println("A whale eats...");
	    }
	}
	public class Penguin extends AnimalOrder {
	    public Penguin() {
	        super();
	        System.out.println("A new bird has been created!");
	    }
	     
	    @Override
	    public void sleep() {
	        System.out.println("A penguin sleeps...");
	    }
	     
	    @Override
	    public void eat() {
	        System.out.println("A penguin eats...");
	    }

	
	}		
	public class Parrot extends AnimalOrder {
	    public Parrot() {
	        super();
	        System.out.println("A new parrot has been created!");
	    }
	    
	    public void speak(){
		     System.out.println("Hi I'm Perry the Parrot!");
		        
	    }
	    public void vocabulary(){
		     System.out.println("Pizza! Heather! Nuts! Bird! Parrot!");
		        
	    }
	    @Override
	    public void sleep() {
	        System.out.println("A parrot sleeps...");
	    }
	     
	    @Override
	    public void eat() {
	        System.out.println("A parrot eats...");
	    }
	}
	public class MainClass {
	    public void main(String[] args) {
	        AnimalOrder animal = new AnimalOrder();
	        Parrot parrot = new Parrot();
	        Dog dog = new Dog();
	        Whale whale = new Whale();
	        Penguin penguin = new Penguin();
	         
	        System.out.println();
	         
	        animal.sleep();
	        animal.eat();
//	         
//	        Parrot.sleep();
//	        Parrot.eat();
//	         
	        dog.sleep();
	        dog.eat();
	    }
	}
} // closing brackets


