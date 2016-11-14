package thinkinginjava.interfaces;
abstract class sup{
	abstract void print();
	
	sup(){
		print();
	}
}

class sub extends sup{
	int x = 1;
	
	void print(){
		System.out.println(x);
	}
}
public class E03_Interfaces {

	public static void main(String[] args) {
		new sub().print();
	}
}
