package thinkinginjava.reusing;
class Cleanser{
	private String s = "Cleanser";
	
	public void append(String a){
		s += a;
	}
	
	public void dilute(){
		append(" dilute() ");
	}
	
	public void apply(){
		append(" apply() ");
	}
	
	public void scrub(){
		append(" scrub() ");
	}
	
	public String toString(){
		return s;
	}
}

class DetergentDelegation{
	Cleanser cl = new Cleanser();
	
	public void append(String a){
		cl.append(a);
	}
	
	public void dilute(){
		cl.dilute();
	}
	
	public void apply(){
		cl.apply();
	}
	
	public void scrub(){
		cl.scrub();
	}
	
	public String toString(){
		return cl.toString();
	}
	
	public void foam(){
		append(" foam() ");
	}
}
public class E11_Reusing {

}
