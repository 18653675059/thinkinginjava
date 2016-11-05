package thinkinginjava.reusing;
class Insect{
	private int i = 9;
	protected int j;
	Insect(){
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	
	static int printInit(String s){
		System.out.println(s);
		return 47;
	}
}

class Beetle extends Insect{
	private int k = printInit("Beetle.k initialized");
	
	public Beetle(){
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	private static int x2 = printInit("static Beetle.x2 initialized");
	
}

class Beetles extends Beetle{
	private int m = printInit("Beetles.m initialized");
		
	public Beetles(){
		System.out.println("m = " + m);
		System.out.println("j = " + j);
	}
	
	private static int x3 = printInit("static Beetles.x3 initialized");
}
public class E24_Reusing {
	public static void main(String[] args) {
		System.out.println("Beetles constructor");
		Beetles b = new Beetles();
	}
}
