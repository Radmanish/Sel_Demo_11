package IntefaceAbstractClassDemo;

public class Elephant extends Animal implements SpecialFeatures {

	
	@Override
	public void eat() {
		System.out.println("Elephant eats 70 KG of food daily");		
	}

	@Override
	public void sleep() {
		System.out.println("Elephant sleeps for 12 hours daily");		
	}

	@Override
	public void run() {
		System.out.println("Elephant can run at 20 KM/H speed");		
	}

	@Override
	public void tusk() {
		System.out.println("Uses its Tusk to drink water");
		
	}

	
	
}
