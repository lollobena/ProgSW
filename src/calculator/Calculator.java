package calculator;

import interfaces.ICalculator;
import interfaces.IRectangle;
import interfaces.ISquare;

public class Calculator implements ICalculator {

	@Override
	public double calcArea(IRectangle r) {
		return r.getHeight() * r.getWidth();
	}

	@Override
	public double calcArea(ISquare s) {
		return Math.pow(s.getSide(), 2);
	}

}
