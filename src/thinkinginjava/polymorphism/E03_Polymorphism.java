package thinkinginjava.polymorphism;

public class E03_Polymorphism {
	public static void main(String args[]) {
		Shape[] shapes = {new Circle(), new Square(), new Triangle(),};
		 // Make polymorphic method calls:
		for(Shape shape : shapes) {
			shape.draw();
			shape.erase();
			shape.msg();
		}
	} 
}
