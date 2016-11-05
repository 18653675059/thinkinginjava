package thinkinginjava.polymorphism;

public class E04_Polymorphism {
	public static void main(String args[]) {
		Shape[] shapes = {new Circle(), new Square(), new Triangle(),new Tetrahedron()};
		// Make polymorphic method calls:
		for(Shape shape : shapes) {
			shape.draw();
			shape.erase();
			shape.msg();
		}
	} 
}

class Tetrahedron extends Shape {
	
	public void draw() { 
		System.out.println("Tetrahedron.draw()"); 
	}
	
	public void erase() { 
		System.out.println("Tetrahedron.erase()"); 
	}
	
	public void msg() { 
		System.out.println("Tetrahedron.msg()"); 
	}
} 