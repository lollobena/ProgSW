package data;

import interfaces.ISquare;

public class Square implements ISquare {

	private float side = 0f;
	
	public Square(float side) {
		this.side = side;
	}
	
	@Override
	public float getSide() {
		return side;
	}

}
