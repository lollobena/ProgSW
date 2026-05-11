package data;

import interfaces.ISquare;

public class Square implements ISquare {

	private double side = 0f;
	
	public Square(double s) {
		setSide(s);
	}
	
	@Override
	public double getSide() {
		return side;
	}

	@Override
	public void setSide(double s) {
		side = s;
	}

}
