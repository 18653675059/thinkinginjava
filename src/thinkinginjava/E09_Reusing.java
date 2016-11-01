package thinkinginjava;
class Component1{
	Component1(){
		System.out.println("Component1 Constructor");
	}
}

class Component2{
	Component2(){
		System.out.println("Component2 Constructor");
	}
}

class Component3{
	Component3(){
		System.out.println("Component3 Constructor");
	}
}

class Root{
	Component1 a;
	Component2 b;
	Component3 c;
	
	Root(){
		System.out.println("Root Constructor");
		a = new Component1();
		b = new Component2();
		c = new Component3();
	}
}

class Stem extends Root{
	Component1 a;
	Component2 b;
	Component3 c;
	Stem(){
		System.out.println("Stem Constructor");
		a = new Component1();
		b = new Component2();
		c = new Component3();
	}
}

public class E09_Reusing {
	public static void main(String[] args) {
		new Stem();
	}
}
