package automobile;

public class CarsOverLoading3 {
	
	// Ways to overload
	//1. Number of parameters could be different 
	//2. Data type of parameters are different
	//3. Sequence of data type is different  <--
	
	public static void main(String[] args) {
		increaseSeatHeight("2", 2);
		increaseSeatHeight(4, "4");
		
	}
	
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("First overload");
	}
	
	public static void increaseSeatHeight(int variable2, String variable1) {
		System.out.println("Second overload");
	}
	
}


