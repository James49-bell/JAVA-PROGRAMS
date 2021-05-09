public class Main {

	public static void main(String[] args) {

		Car car = new Car("Cheverolet", "corvette", 2020);
		Car car1 = new Car("ford", "mustang", 2022);

		car1.copy(car);
		System.out.println(car);
		System.out.println(car1);
		System.out.println();
		System.out.println(car.getMake());
		System.out.println(car.getmodel());
		System.out.println(car.getyear());
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getmodel());
		System.out.println(car1.getyear());

	}

}
