package in.edu.tint.cse.test;

import in.edu.tint.cse.project.A;
import in.edu.tint.cse.project.C;
import in.edu.tint.cse.project.Intf1;
import in.edu.tint.cse.project.Intf2;

public class TestMain {

	public static void main(String[] args) {
		A a = new A();
		a.method1();
		a.method2();

		Intf1 i1 = new A();
		i1.method1();
		// i1.method2();
		System.out.println(i1.x);

		Intf2 i2 = new A();
		i2.method2();
		// i2.method1();
		
		// ==================================
		A.print();
		C.print();

	}

}
