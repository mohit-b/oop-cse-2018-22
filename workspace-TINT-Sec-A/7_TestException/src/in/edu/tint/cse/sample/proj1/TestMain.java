package in.edu.tint.cse.sample.proj1;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("Hello");
		int x = 10;
		int y = 0;

		try {
			x = x + 7;
			System.out.println(x);
			System.out.println(x / y);
			System.out.println(x + y);
		} catch (ArithmeticException e) {
			System.out.println("You are trying to divide an integer by 0");
			int arr[] = new int[20];
			try {
				System.out.println(arr[25]);
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("Hi");
				e1.printStackTrace();
			}
		} finally {
			System.out.println("I am finally");
		}

		x += 6;
		System.out.println(x);
	}
}
