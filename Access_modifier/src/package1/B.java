package package1;

public class B {
	private String privateMessage = "This is private";

	public static void main(String[] args) {
		B c = new B();
		System.out.println(c.privateMessage);
		// only visible in same package

	}
}
