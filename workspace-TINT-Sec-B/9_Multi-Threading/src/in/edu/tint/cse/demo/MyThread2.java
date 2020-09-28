package in.edu.tint.cse.demo;

public class MyThread2 implements Runnable {
	String name;
	Thread t;

	public MyThread2(String name) {
		this.name = name;
		t = new Thread(this, "MyThread2 thread");
		System.out.println(name + ": I am in MyThread2 constuctor");
		t.start();
	}

	public void run() {
		System.out.println("I am in run method of MyThread2 class");
	}
}
