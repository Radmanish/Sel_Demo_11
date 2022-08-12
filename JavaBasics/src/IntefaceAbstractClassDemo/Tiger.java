package IntefaceAbstractClassDemo;

public class Tiger extends Animal{

	@Override
	public void eat() {
		System.out.println("Tiger eats 10 KGs of food daily");		
	}

	@Override
	public void sleep() {
		System.out.println("Tiger sleeps for 16 hours daily");		
	}

	@Override
	public void run() {
		System.out.println("Tiger can run at 50 KM/H speed");		
	}


}
