package thinkinginjava.reusing;
class A{
	A(){
		System.out.println("A Constructor");
	}
}

class B{
	B(){
		System.out.println("B Constructor");
	}
}

class C extends A{
	B b = new B();
}
public class E05_Reusing {
	public static void main(String[] args) {
		new C();
	}
}
