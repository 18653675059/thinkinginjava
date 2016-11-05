package thinkinginjava.polymorphism;

import java.util.Random;

public class E02_Polymorphism {
	 private static RandomShapeGenerator gen = new RandomShapeGenerator();
	 public static void main(String[] args) {
	 Shape[] shapes = new Shape[9];
	 // Fill up the array with shapes:
	 for(int i = 0; i < shapes.length; i++)
	 shapes[i] = gen.next();
	 // Make polymorphic method calls:
	 for(Shape shape : shapes)
	 shape.draw();
	 }
}

class RandomShapeGenerator {
	private Random rand = new Random(47);
	public Shape next() {
		switch(rand.nextInt(3)) {
		 default:
		 case 0: return new Circle();
		 case 1: return new Square();
		 case 2: return new Triangle();
		}
	}
}

class Square extends Shape {
	
	@Override 
	public void draw() {
		System.out.println("Square.draw()"); 
	}
	
	@Override 
	public void erase() {
		System.out.println("Square.erase()"); 
	}
	
	public void msg() { 
		System.out.println("Square msg()"); 
	}
} 

class Triangle extends Shape {
	
	@Override 
	public void draw() {
		System.out.println("Triangle.draw()"); 
	}
	
	@Override 
	public void erase() {
		System.out.println("Triangle.erase()");
	}
	
	public void msg() { 
		System.out.println("Triangle msg()"); 
	}
} 

class Circle extends Shape {
	
	@Override 
	public void draw() { 
		System.out.println("Circle.draw()"); 
	}
	
	@Override 
	public void erase() {
		System.out.println("Circle.erase()"); 
	}
	
	public void msg() { 
		System.out.println("Circle msg()"); 
	}
}

class Shape{
	public void draw(){
		
	}
	
	public void erase(){
		
	}
	
	public void msg() { 
		System.out.println("Base class msg()"); 
	}
}