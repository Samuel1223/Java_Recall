public class Constructors{
	public static void main(String[] args){
	Dog myDog = new Dog("George", 33)	;
	System.out.println(mydog.name + " " + myDog.age);
}
}

// special type of methods to create new object
// 其實有點像_init_

public class Dog entends Animal{
	String name;
	int age;

public Dog(String name, int age){
// help to create object!!
// 可以發現constructor這一個function名稱跟class一樣
// 甚至不需要void

	this.name = name; //this 區分object跟blue print的name
	this.age = age;

public Dog(){}//這一邊可以處理default
}//constructor

}class