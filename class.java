public class AwesomeJavaProgram{
		
		//static 可以不用宣告class 就去使用那一個function
     public static void main(String []args){
        Cat myCat = new Cat();
				myCat.name = "Fred";
				myCat.age = 6;
				myCat.meow();
				

				Cat cat1 = new Cat();
				cat1.name = "Stella";
				cat1.age = 6;
				
				Cat cat2 = new Cat();
				Cat cat3 = new Cat();
				Cat cat4 = new Cat();
     }
}

public class Cat extends Animal{

	String name;
	int age;
// private: 只有class內部可以call
	public static void meow(){
		System.out.println("Meow");
	}

	public static void dingDong(){
		System.out.println("Ding dong");
	}
}