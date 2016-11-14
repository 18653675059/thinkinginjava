package thinkinginjava.polymorphism;
class Cycle{
	
	public int wheels() { 
		return 0; 
	} 
}

class Unicycle extends Cycle{
	
	public int wheels() { 
		return 1; 
	}
	
	public void balance(){
		System.out.println("unicycle balance");
	}
}

class Bicycle extends Cycle{
	
	public int wheels() { 
		return 2; 
	}
	
	public void balance(){
		System.out.println("bicycle balance");
	}
}

class Tricycle extends Cycle{
	
	public int wheels() { 
		return 3; 
	}
}

public class E01_Polymorphism {
	public static void ride(Cycle c) {
		
	}
	public static void main(String[] args) {
		ride(new Cycle()); // No upcasting
		ride(new Unicycle()); // Upcast
		ride(new Bicycle()); // Upcast
		ride(new Tricycle()); // Upcast
	}
}
