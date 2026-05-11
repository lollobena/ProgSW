package data;

public class RectangleWithRound extends Rectangle {

	public RectangleWithRound(double h, double w) {
		super(Math.ceil(h), Math.ceil(w));
	}

}
