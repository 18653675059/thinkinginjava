package thinkinginjava.reusing;
/**
 * 第七章练习3和4
 * 练习4缺少一个前提：当构建子类对象时，基类构造器总是会被调用，并且在子类构造器之前被调用
 * @author Carlos
 *
 */
class Art{
	Art(){
		System.out.println("Art Constructor");
	}
}

class Drawing extends Art{
	Drawing(){
		System.out.println("Drawing Constructor");
	}
}

public class Cartoon extends Drawing{

	public static void main(String[] args){
		Cartoon x = new Cartoon();
	}
}
