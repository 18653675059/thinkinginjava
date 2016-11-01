package thinkinginjava;
class A_08{
	A_08(int i){
		System.out.println("A_08 Constructor " + i);
	}
}

class B_08 extends A_08{
	B_08(){
		super(2);
		System.out.println("B_08 Constructor");
	}
	
	B_08(int i){
		super(i);
		System.out.println("B_08 Constructor");
	}
}
public class E08_Reusing {
	public static void main(String[] args) {
		new B_08(3);
		new B_08();
	}
}
