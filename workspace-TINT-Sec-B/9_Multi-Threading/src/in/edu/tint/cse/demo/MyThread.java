package in.edu.tint.cse.demo;

public class MyThread extends Thread {
	String name;
	public Thread t;

	public MyThread(String name) {
		this.name = name;
		t = new Thread(this, "MyThread thread");
		System.out.println(name + " : I am in MyThread constructor");
		t.start();
	}

	public void run() {
		try {
			t.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int x = 1; x < 50; x++) {
			System.out.println("I am in run method of MyThread class");
		}

	}

}
