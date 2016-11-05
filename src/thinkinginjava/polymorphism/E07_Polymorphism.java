package thinkinginjava.polymorphism;
class Electronic extends Instrument {
	void play(Note n) { 
		System.out.println("Electronic.play() " + n); 
	}
	
	public String toString () { 
		return "Electronic"; 
	}
} 
public class E07_Polymorphism {
	static Instrument[] orchestra = {
		new Wind(),
		new Percussion(),
		new Stringed(),
		new Brass(),
		new Woodwind(),
		new Electronic()
	};
		
	public static void printAll(Instrument[] orch) {
		for(Instrument i : orch){
			i.play(Note.MIDDLE_C);
		 	i.adjust();
			System.out.println(i);
		}	
	}
		
	public static void main(String args[]) {
		printAll(orchestra);
	} 
}
