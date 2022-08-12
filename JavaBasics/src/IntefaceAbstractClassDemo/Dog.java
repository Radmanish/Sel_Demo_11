package IntefaceAbstractClassDemo;

public class Dog extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Dog eats 5 KG food daily");		
	}

	@Override
	public void sleep() {
		System.out.println("A dog sleeps for 10 hours daily");		
	}

	@Override
	public void run() {
		System.out.println("Dog can run at 30 KM/H speed");		
	}


}
