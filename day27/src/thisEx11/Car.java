package thisEx11;

class Car {
	
	String color;
	int speed;

	public Car() {
	}
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	public Car(String color) {
		this.color = color;
	}
	
	
	void upSpeed(int value) {
		speed = speed + value;
	}

	void downspeed(int value) {
		speed = speed - value;
	}
}

