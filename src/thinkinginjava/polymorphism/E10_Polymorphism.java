package thinkinginjava.polymorphism;
class Sup{
	public void method1(){
		method2();
	}
	
	public void method2(){
		System.out.println("sup method2");
	}
}

class Sub extends Sup{
	@Override
	public void method2(){
		System.out.println("sub method2");
	}
}

public class E10_Polymorphism {
	public static void main(String[] args) {
		Sup sup = new Sub();
		sup.method1();
	}
}
