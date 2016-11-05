package thinkinginjava;
class Amphibian_17{
	void echo(Amphibian_17 a){
		System.out.println("super method running");
	}
}

class Frog_17 extends Amphibian_17{
	@Override
	void echo(Amphibian_17 a){
		System.out.println("sub method running");
	}
}

public class E17_Reusing {
	public static void main(String[] args) {
		new Frog_17().echo(new Frog_17());
	}
}
