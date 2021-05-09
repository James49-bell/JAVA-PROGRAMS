package package2;

import package1.A;

public class Asub extends A {
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.defaultMessage);
		System.out.println(c.publicMessage);
		// only visible in same package

		Asub sub = new Asub();
		System.out.println(sub.protectedMessage);

	}
}
