package calculator;

import data.*;
import interfaces.*;

public class CalculatorWithOptimization extends Calculator {
	@Override
	public double calcArea(IRectangle r) {
		return r.getHeight() == 0 || r.getWidth() == 0 ? 0 : super.calcArea(r);
	}
	
	@Override
	public double calcArea(ISquare s) {
		return s.getSide() == 0 ? 0 : super.calcArea(s);
	}
}
