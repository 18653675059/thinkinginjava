package thinkinginjava.polymorphism;
/**
 * 
 * @author admin
 * 需要知道某个对象什么时候被创建，什么时候被销毁以及第几次被创建
 * 
 */
class Shared2{
	public static int id;
	public Shared2(){
		id++;
		System.out.println("create object by id: " + id);
	}
	
	public void destory(){
		System.out.println("object destory id: " + id);
	}
}
public class E14_Polymorphism {
	public static void main(String[] args) {
		new Shared2().destory();
		new Shared2();
		new Shared2();
		new Shared2();
		new Shared2();
	}
}
