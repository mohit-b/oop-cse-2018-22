package in.edu.tint.cse.demo;

public class TestMain {

	public static void main(String[] args) {
		MyThread myThread = new MyThread("MyThread");

		for (int x = 1; x < 50; x++) {
		
			System.out.println("Hello");
		}

	}
}
