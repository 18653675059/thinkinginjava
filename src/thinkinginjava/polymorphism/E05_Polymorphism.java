package thinkinginjava.polymorphism;

public class E05_Polymorphism {
	
	public static void ride(Cycle c) {
		System.out.println("Num. of wheels: " + c.wheels());
	}
	
	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	} 
}
