public class Fish implements Prey, Predector {

	@Override
	public void hunt() {
		System.out.println("* This fish is hunting * ");
	}

	@Override
	public void flee() {
		System.out.println("* This fish can Flee*");

	}

}
