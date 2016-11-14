package thinkinginjava.polymorphism;
class Meal{
	public Meal() {
		// TODO Auto-generated constructor stub
		System.out.println("Meal()");
	}
}

class Bread{
	public Bread() {
		// TODO Auto-generated constructor stub
		System.out.println("Bread()");
	}
}

class Cheese{
	public Cheese() {
		// TODO Auto-generated constructor stub
		System.out.println("Cheese()");
	}
}

class Lettuce{
	public Lettuce() {
		// TODO Auto-generated constructor stub
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal{
	public Lunch() {
		// TODO Auto-generated constructor stub
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch{
	public PortableLunch() {
		// TODO Auto-generated constructor stub
		System.out.println("PortableLunch()");
	}
}

class Pickle{
	public Pickle() {
		// TODO Auto-generated constructor stub
		System.out.println("Pickle()");
	}
}
class Sandwich extends PortableLunch{
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();
	private Pickle p = new Pickle();
	public Sandwich(){
		System.out.println("Sandwich()");
	}
}
public class E11_Polymorphism {
	public static void main(String[] args) {
		new Sandwich();
	}
}
