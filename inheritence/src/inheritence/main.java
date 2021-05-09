package inheritence;

public class main {

	public static void main(String[] args) {

		car car = new car();
		//
		// car.go();

		bicycle bicycle = new bicycle();
		// bicycle.stop();
		//
		System.out.println(car.speed);
		System.out.println(bicycle.speed);

		System.out.println(car.doors);
		System.out.println(bicycle.pedals);
	}
}
