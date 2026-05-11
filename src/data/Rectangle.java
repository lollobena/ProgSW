package data;

import interfaces.IRectangle;

public class Rectangle implements IRectangle {

	private double width = 0f;
	private double height = 0f;
	
	public Rectangle(double h, double w) {
		 setHeight(h);
		 setWidth(w);
	}
	
	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public void setHeight(double h) {
		height = h;
	}

	@Override
	public void setWidth(double w) {
		width = w;
	}

}
