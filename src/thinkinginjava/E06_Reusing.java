package thinkinginjava;
/**
 * 注释掉下列语句后，编译器会报错
 * @author Carlos
 *
 */
class Game{
	Game(int i){
		System.out.println("Game Constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame Constructor");
	}
}

class Chess extends BoardGame{
	Chess(){
		//super(11);
		System.out.println("Chess Constructor");
	}
}

public class E06_Reusing {
	public static void main(String[] args) {
		Chess x = new Chess();
	}
}
