public class Main {
	public static void main(String[] args) {

		// interface = a template that can be applied to a class
		// similar to inheritance, but specifies what a class has / must do.
		// classes can apply more than one interface, inheritance is limited to
		// 1 super

		Rabbit rabbit = new Rabbit();

		rabbit.flee();
		Hawak hawak = new Hawak();
		hawak.hunt();

		System.out.println();

		Fish fish = new Fish();
		// Fish fish1 = new Fish();
		fish.flee();
		fish.hunt();
		// fish1.hunt();

	}
}
