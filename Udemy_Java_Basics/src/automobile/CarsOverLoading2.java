package automobile;

public class CarsOverLoading2 {
	
	// Ways to overload
	//1. Number of parameters could be different  
	//2. Data type of parameters are different <--
	//3. Sequence of data type is different
	
	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight("8");
		
	}
	
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease + " inches. One");
	}
	
	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease + " inches. Two");
	}

}