package thinkinginjava.polymorphism;
class Rodent{
	public Rodent() {
		// TODO Auto-generated constructor stub
		System.out.println("Rodent constructor");
	}
	
	public void eat(){
		System.out.println("Rodent eat");
	}
}

class Mouse extends Rodent{
	public Mouse() {
		// TODO Auto-generated constructor stub
		System.out.println("Mouse constructor");
	}
	
	public void eat(){
		System.out.println("Mouse eat");
	}
}

class Gerbil extends Rodent{
	public Gerbil() {
		// TODO Auto-generated constructor stub
		System.out.println("Gerbil constructor");
	}
	
	public void eat(){
		System.out.println("Gerbil eat");
	}
}

class Hamster extends Rodent{
	public Hamster() {
		// TODO Auto-generated constructor stub
		System.out.println("Hamster constructor");
	}
	
	public void eat(){
		System.out.println("Hamster eat");
	}
}

public class E09_Polymorphism {
	public static Rodent[] r = {
		new Rodent(),
		new Mouse(),
		new Gerbil(),
		new Hamster()
	};
	
	public static void main(String[] args) {
		for(Rodent ele : r){
			ele.eat();
		}
	}
}
