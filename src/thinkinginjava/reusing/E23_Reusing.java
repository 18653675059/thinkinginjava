package thinkinginjava.reusing;
/**
 * 请证明加载类的动作仅发生一次。证明该类的第一个实体的创建或者对static成员的访问都有可能引起加载。
 * @author carlos
 * 前一个论点证明很简单，后一个论点中对static成员的访问都有可能引起加载会有歧义。
 * 因为构造器也是static方法，尽管static关键字并没有显式地写出来，因此实体的创建也等价于对static成员的访问。
 * 但是对其他static方法进行访问时不会导致类的加载，因为其构造器并没有被触发。
 */
class Load{
	int count;
	
	Load(){
		count++;
		System.out.println(count);
	}

	static void method(){
		System.out.println("method running");
	}
}
public class E23_Reusing {
	public static void main(String[] args) {
//		new Load();
//		new Load();
//		new Load();
		Load.method();
	}
}
