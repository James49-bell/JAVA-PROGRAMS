package method_overriding;

public class Dog extends Animal {

	@Override
	void speak() {
		System.out.println(" Dog * barks*");
	}

}