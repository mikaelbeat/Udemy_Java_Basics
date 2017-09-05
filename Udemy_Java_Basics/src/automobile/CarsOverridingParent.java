package automobile;

public class CarsOverridingParent {
	
	public void engineStart(int cyl){
		System.out.println("I am from parent class");
	}

	
	public void increaseSpeed() {
		System.out.println("I am the icrease speed from the parent class");
	}
	
	public static void staticExample() {
		System.out.println("I am the static method from parent class");
	}
}
