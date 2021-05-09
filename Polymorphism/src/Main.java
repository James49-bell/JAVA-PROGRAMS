public class Main {

	public static void main(String[] args) {
		// Polymorpism = greek work for poly" many", morph " form"
		// The ability of an object to identify as more than one type

		Car car = new Car();
		bicycle cycle = new bicycle();
		Boat boat = new Boat();

		// Car[] racers = { car, cycle, boat }; we can store only car in array
		// of car
		// bicycle[] racers = { car, cycle, boat }; we can store only cycle in
		// array
		// Boat[] racers = { car, cycle, boat }; we can store only boat in array

		// To solve this issue we use concept called polymorphism

		Vehicle[] racers = { car, cycle, boat };
		// Since using Vehicle as an array we can store all the element in an
		// array
		// This because car extends Vehicle, Boat extends Vehicle, bicycle
		// extends Vehicle

		// car.go();
		// cycle.go();
		// boat.go();

		// The above can be works but we can implement in better way too
		for (Vehicle x : racers) {
			x.go();

		} // Where x is points car, cycle, boat or whatever its just gonna print
			// all the stuff once

	}

}
