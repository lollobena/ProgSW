package calculator;

import interfaces.ICalculator;
import interfaces.IRectangle;
import interfaces.ISquare;

public class Calculator implements ICalculator {

	@Override
	public float calcArea(IRectangle r) {
		return r.getHeight() * r.getWidth();
	}

	@Override
	public float calcArea(ISquare s) {
		return (float) Math.pow(s.getSide(), 2);
	}

}
