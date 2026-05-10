package data;

public class RectangleWithRound extends Rectangle {

	public RectangleWithRound(float h, float w) {
		super((float)Math.ceil(h), (float)Math.ceil(w));
	}

}
