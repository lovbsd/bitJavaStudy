package work1;

import cls.Circle;
import cls.Point3D;
import cls.Rectangle;
import cls.Shape;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		Shape circle = new Circle(3.0);
		System.out.println(circle.calcArea());
		
		Shape rectangle = new Rectangle(23, 34);
		System.out.println(rectangle.calcArea());
		System.out.println("정사각형 = " + ((Rectangle)rectangle).isSquare());
		*/
		
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);

		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println("p1==p2?"+(p1==p2));		
		System.out.println("p1.equals(p2)?"+( p1.equals(p2) ));
		
		
	}

}
