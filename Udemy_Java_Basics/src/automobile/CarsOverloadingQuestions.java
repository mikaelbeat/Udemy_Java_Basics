package automobile;

public class CarsOverloadingQuestions {

	public static void main(String[] args) {
		increaseSeatHeight("2", 2);

	}
	
	public static void increaseSeatHeight(String variable1, int variable2) {
		System.out.println("I am the 1st overload.");
	}
	
	public static void increaseSeatHeight(String variable3, String variable4) {
		System.out.println("I am the 2st overload.");
	}

}
