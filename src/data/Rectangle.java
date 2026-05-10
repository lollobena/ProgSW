package data;

import interfaces.IRectangle;

public class Rectangle implements IRectangle {

	private float width = 0f;
	private float height = 0f;
	
	public Rectangle(float h, float w) {
		 height = h;
		 width = w;
	}
	
	@Override
	public float getHeight() {
		return height;
	}

	@Override
	public float getWidth() {
		return width;
	}

}
