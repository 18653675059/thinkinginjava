package thinkinginjava;
class Amphibian{
	void echo(Amphibian a){
		System.out.println("method running");
	}
}

class Frog extends Amphibian{

}

public class E16_Reusing {
	public static void main(String[] args) {
		new Frog().echo(new Frog());
	}
}
