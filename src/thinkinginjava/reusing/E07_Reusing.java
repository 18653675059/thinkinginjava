package thinkinginjava.reusing;
class A_07{
	A_07(int i){
		System.out.println("A_07 Constructor");
	}
}

class B_07{
	B_07(int i){
		System.out.println("B_07 Constructor");
	}
}

class C_07 extends A_07{
	C_07(){
		super(1);
		new B_07(2);
		System.out.println("C_07 Constructor");
	}
}

public class E07_Reusing {
	public static void main(String[] args) {
		new C_07();
	}
}
