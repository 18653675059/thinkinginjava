package thinkinginjava.polymorphism;
class Rodent{
	public void eat(){
		System.out.println("Rodent eat");
	}
}

class Mouse extends Rodent{
	public void eat(){
		System.out.println("Mouse eat");
	}
}

class Gerbil extends Rodent{
	public void eat(){
		System.out.println("Gerbil eat");
	}
}

class Hamster extends Rodent{
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
