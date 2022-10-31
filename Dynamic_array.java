import java.util.ArrayList;

public class LearnJava{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<>();//注意ArrayList只可以放object, 不能primitive
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Float> list = new ArrayList<>();
		ArrayList<Double> list = new ArrayList<>();
		ArrayList<Long> list = new ArrayList<>();
		list.add("India");
		list.add("USA");
		list.add("China");
		list.add(1, "North Korea");// 指定要插入的index
		list.get(1);//取到index 1
		list.remove(0);// 刪除index 0的
		list.contains("India"); //whether element is in list(True or False)
		list.clear();// deleter all element in list
 
		
	//Array List 可存取物件 class
		ArrayList<Rectangle> list = new ArrayList<>();

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		list.add(r1);
		list.add(r2);



		for(String s: list){ // for 搭配list使用的語法!!
			System.out.println(s);
}
}//main
}//class


class Rectangle {
	float l;
	float b;
}