
public class RunTimeExceptionDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		int c;
		try {
		c = a / b;
		System.out.println("The result is: " + c);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Dividing by zero is not possible");
		}
		
		
		int [] numbers = {1, 2, 3};
		try {
		for (int i = 0; i <= 3; i++) {
			System.out.println(numbers[i]);
		}
		}
		catch (Exception e) {
			System.out.println("There is no index available after 2");
		}
}
}