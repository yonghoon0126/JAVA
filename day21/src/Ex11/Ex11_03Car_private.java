package Ex11;

class Ex11_03Car_private {
	
	private String color;
	private int speed;
//	public int setSpeed;
//	public String setColor;
	
	// setter()
	public void setColor(String color) {
		this.color = color;
	}
	// getter()
	public String getColor() {
		return color;
	}
	
	
	// setter()
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// getter()
	public int getSpeed() {
		return speed;
	}
	
	
	// setter()
	public void upSpeed(int value) {
		speed = speed + value;
	}
	public void downspeed(int value) {
		speed = speed - value;
	}

	// getter()
	public int upSpeed() {
		return speed;
	}
	public int downspeed() {
		return speed;
	}
	
}

