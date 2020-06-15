package cls;

public class Rectangle extends Shape {

	int width;
	int height;
	
	public Rectangle() {
		this(0, 0);
	}
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public Boolean isSquare() {
		if(width == height) {
			return true;
		}
		return false;
	}

	@Override
	public double calcArea() {		
		return width * height;
	}

}







