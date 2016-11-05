package thinkinginjava.reusing;
class SelfCounter{
	private static int count;
	private int id = count++;
	public String toString(){
		return "SelfCounter" + id;
	}
}

class WithFinalFields{
	final SelfCounter scf = new SelfCounter();
	static final SelfCounter scsf = new SelfCounter();
	public String toString(){
		return "scf = " + scf + "\nscsf = " + scsf;
	}
}

public class E18_Reusing {
	public static void main(String[] args) {
		System.out.println("First Object");
		System.out.println(new WithFinalFields());
		System.out.println("Second Object");
		System.out.println(new WithFinalFields());
	}
}
