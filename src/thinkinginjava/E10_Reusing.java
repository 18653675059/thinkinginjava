package thinkinginjava;
class Component1_10{
	Component1_10(int i){
		System.out.println("Component1_10 Constructor");
	}
}

class Component2_10{
	Component2_10(String str){
		System.out.println("Component2_10 Constructor");
	}
}

class Component3_10{
	Component3_10(int j){
		System.out.println("Component3_10 Constructor");
	}
}

class Root_10{
	Component1_10 a;
	Component2_10 b;
	Component3_10 c;
	
	Root_10(String str){
		System.out.println("Root_10 Constructor");
		a = new Component1_10(1);
		b = new Component2_10(str);
		c = new Component3_10(3);
	}
}

class Stem_10 extends Root_10{
	Component1_10 a;
	Component2_10 b;
	Component3_10 c;
	Stem_10(String str){
		super(str);
		System.out.println("Stem_10 Constructor");
		a = new Component1_10(1);
		b = new Component2_10(str);
		c = new Component3_10(3);
	}
}

public class E10_Reusing {
	public static void main(String[] args) {
		new Stem_10("test");
	}
}
