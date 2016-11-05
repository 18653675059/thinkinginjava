package thinkinginjava;
class WithFinals{
	private final void f(){
		System.out.println("WithFinals.f()");
	}
	
	private void g(){
		System.out.println("WithFinals.g()");
	}
}
public class E20_Reusing extends WithFinals{
	
	@Override
	public final void f(){
		System.out.println("E20_Reusing.f()");
	}
	
	@Override
	public void g(){
		System.out.println("E20_Reusing.g()");
	}
	
	public static void main(String[] args){
		
	}
}
