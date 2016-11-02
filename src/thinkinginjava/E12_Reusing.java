package thinkinginjava;
class Component1_12{
	Component1_12(){
		System.out.println("Component1_12 Constructor");
	}
	
	void dispose(){
		System.out.println("Component1_12 dispose");
	}
}

class Component2_12{
	Component2_12(){
		System.out.println("Component2_12 Constructor");
	}
	
	void dispose(){
		System.out.println("Component2_12 dispose");
	}
}

class Component3_12{
	Component3_12(){
		System.out.println("Component3_12 Constructor");
	}
	
	void dispose(){
		System.out.println("Component3_12 dispose");
	}
}

class Root_12{
	Component1_12 a;
	Component2_12 b;
	Component3_12 c;
	
	Root_12(){
		System.out.println("Root_12 Constructor");
		a = new Component1_12();
		b = new Component2_12();
		c = new Component3_12();
	}
	
	void dispose(){
		c.dispose();
		b.dispose();
		a.dispose();
		System.out.println("Root_12 dispose");
	}
}

class Stem_12 extends Root_12{
	Component1_12 a;
	Component2_12 b;
	Component3_12 c;
	Stem_12(){
		System.out.println("Stem_12 Constructor");
		a = new Component1_12();
		b = new Component2_12();
		c = new Component3_12();
	}
	
	void dispose(){
		c.dispose();
		b.dispose();
		a.dispose();
		System.out.println("Stem_12 dispose");
	}
}

public class E12_Reusing {

}
