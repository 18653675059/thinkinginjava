package thinkinginjava.polymorphism;

import java.util.Random;

class RandomInstrumentGenerator{
	private Random rand = new Random(47);
	public Instrument next(){
		switch(rand.nextInt(5)){
			default:
			case 0: 
				return new Wind();
			case 1:
				return new Percussion();
			case 2:
				return new Stringed();
			case 3:
				return new Brass();
			case 4:
				return new Woodwind();
		}
	}
}
public class E08_Polymorphism {
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
	
	public static void printAll(Instrument[] orch) {
		for(Instrument i : orch){
			i.play(Note.MIDDLE_C);
		 	i.adjust();
			System.out.println(i);
		}	
	}
	
	public static void main(String[] args) {
		Instrument[] in = new Instrument[10];
		for(int i = 0; i < in.length; i++){
			in[i] = gen.next();
		}
		printAll(in);
	}
}
