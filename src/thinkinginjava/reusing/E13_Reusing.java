package thinkinginjava.reusing;
class Homer{

	void doh(int i){
		System.out.println("int");
	}
	
	void doh(String a){
		System.out.println("String");
	}
	
	void doh(char c){
		System.out.println("char");
	}
}

class Bart extends Homer{

	void doh(Double d){
		System.out.println("double");
	}
}

public class E13_Reusing {
	public static void main(String[] args) {
		new Bart().doh(1);
		new Bart().doh(1.2);
		new Bart().doh('b');
		new Bart().doh("111111");
	}
}
