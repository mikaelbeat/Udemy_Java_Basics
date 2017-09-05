
public class LoopsDemo {

	public static void main(String[] args) {

		// for (initialization; boolean experssion; update)
		for (int i = 0; i < 10; i++) {
			System.out.println("The value of i: " + i);		
		}
		System.out.println("********************");
		
		int[] numbers = {10, 20, 30};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The value of index " + i + " is: " + numbers[i]);
		}
		System.out.println("********************");
		
		for (int number: numbers) {
			System.out.println("The value is: " + number);
		}
		System.out.println("********************");
		String[] cars = {"BMW", "Audi", "Honda"};
		for (String car: cars) {
			System.out.println(car);
		}
		
	}

}
