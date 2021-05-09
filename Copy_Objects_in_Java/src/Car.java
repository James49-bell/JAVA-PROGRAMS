public class Car {
	private String make;
	private String model;
	private int year;

	Car(String make, String model, int year) {

		// this.make = make;
		// this.model = model;
		// this.year = year;
		this.setMake(make);
		this.setmodel(model);
		this.setyear(year);

	}

	public String getMake() {
		return make;

	}

	public String getmodel() {
		return model;

	}

	public int getyear() {
		return year;

	}

	public void setMake(String make) {

		this.make = make;
	}

	public void setmodel(String model) {

		this.model = model;
	}

	public void setyear(int year) {

		this.year = year;
	}

	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setmodel(x.getmodel());
		this.setyear(x.getyear());

		// this method used for to copy car to car1
	}
}
