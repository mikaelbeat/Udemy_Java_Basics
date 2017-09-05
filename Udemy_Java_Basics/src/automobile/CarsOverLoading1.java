package automobile;

public class CarsOverLoading1 {
	
	// Ways to overload
	//1. Number of parameters could be different  <--
	//2. Data type of parameters are different
	//3. Sequence of data type is different
	
	
	
	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(8, true);
		
	}
	
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease + " inches");
	}
	
	public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight) {
		System.out.println("Increase seat height by " + heightToIncrease + " inches");
		if (rememberHeight) {
			System.out.println("Your selection is saved");
		} else {
			System.out.println("Your selection is not saved");
		}
	}
}
