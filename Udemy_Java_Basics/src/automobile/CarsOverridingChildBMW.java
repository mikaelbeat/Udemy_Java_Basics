package automobile;

// Arguments List: Arguments list in the overriding method should be same as the parent class overridden method
// Access Modifier: Access modifier of the overriding method cannot be more restrictive than the overridden method
// Private, static and final methods cannot be overridden as they are local to the class

public class CarsOverridingChildBMW extends CarsOverridingParent{

	public static void main(String[] args) {
		//CarsOverridingChildBMW c1 = new CarsOverridingChildBMW();
		CarsOverridingParent c1 = new CarsOverridingChildBMW();
		c1.increaseSpeed();
		c1.engineStart(2);

	}
	
	public void engineStart(int cyl){
		//super.engineStart(2);
		System.out.println("I am from child class");
	}
	
	public static void staticExample() {
		System.out.println("I am the static method from child class");
	}

}
