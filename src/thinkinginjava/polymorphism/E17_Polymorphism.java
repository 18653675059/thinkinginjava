package thinkinginjava.polymorphism;

public class E17_Polymorphism {
	public static void main(String[] args) {
		Cycle[] arr = {
				new Unicycle(),
				new Bicycle(),
				new Tricycle()
		};
//		for(Cycle c : arr){
//			c.balance();
//		}
		((Unicycle)arr[0]).balance();
		((Bicycle)arr[1]).balance();
//		((Tricycle)arr[2]).balance();
	}
}
