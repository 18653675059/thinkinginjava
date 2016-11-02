package thinkinginjava;
class sub{
	protected void method() {
		System.out.println("protected method");
	}
}
public class E15_Reusing extends sub{
	public E15_Reusing() {
		// TODO Auto-generated constructor stub
		method();
	}
	
	public static void main(String[] args) {
		new E15_Reusing();
	}
}
