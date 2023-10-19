package Abstract;
import java.util.Scanner;

abstract class shape{
	
	String name;
	
	abstract void calculate_area();
	abstract void display();	
}

class Circle extends shape{
	
	double radius;
	double area;
	
	@Override
	void calculate_area() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		radius=scanner.nextDouble();
		area=3.14*radius*radius;
	}

	@Override
	void display() {
		System.out.println("Shape is circle");
		System.out.println("Radius of circle is "+radius);
		System.out.println("Area of circle is: "+area);
	}
	
}

class Rectangle extends shape{
	
		float length;
		float width;
		float area;


	@Override
	void calculate_area() {
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the length of rectangle");
			length=scanner.nextFloat();
			System.out.println("Enter the width of rectangle");
			width=scanner.nextFloat();
			area=length*width;
	}

	@Override
	void display() {
		System.out.println("Shape is rectangle");
		System.out.println("Length is "+length);
		System.out.println("Width is "+width);
		System.out.println("Area of circle is: "+area);
	}
	}

class Triangle extends shape{
	
	float base;
	float height;
	float area;

	@Override
	void calculate_area() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		base=scanner.nextFloat();
		System.out.println("Enter the width of triangle");
		height=scanner.nextFloat();
		area=(float) (0.5*base*height);
		
	}

	@Override
	void display() {
		System.out.println("Shape is rectangle");
		System.out.println("Base is "+base);
		System.out.println("Height is "+height);
		System.out.println("Area of Triangle is: "+area);		
	}
	
}



public class Q1 {

	public static void main(String[] args) {
		 
//		Circle cc = new Circle();
//		cc.calculate_area();
//		cc.display();
//		Rectangle rr = new Rectangle();
//		rr.calculate_area();
//		rr.display();
		Triangle tt = new Triangle();
		tt.calculate_area();
		tt.display();
		
		
		
		
		
		
		
	}

}