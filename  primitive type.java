public class HelloWorld{
    
    // main function, when we execute, we only run this block
     public static void main(String []args){
        
         // loop
         for (int i = 0; i<10; i++){
             System.out.println("Hi this is samuel");
         }
        
        //primitive type
        int myInt = 7;
        double shoeSize = 9.5;
        char myInitial = 'J'; //this is single quote
        
        double result = myInt * shoeSize;
        
        
        //nonprimitive type, Upper case begin, can use . method
        String myName = "John"; //double quote 
        
        
        
        //call function
        printName("samuel", 3);// pass value in parameter
        
        
        System.out.println(myName.length());
        System.out.println(myName.toUpperCase());
        System.out.println(ifName("John", 50));
     }
     
     
     // void is also indicate the type you return
     private static double printName(String name, double age){
         System.out.println("My name is " + name);
         return age * 10;
         
     }
     // void is also indicate the type you return
     private static int ifName(String name, int number){
        
        if (name.equals("John")){
            System.out.println("This guy is awesome");
        }
        
        else if(name.equals("Larry")){
            System.out.println("This guy is OK I guess");
        }
        
        else{
            System.out.println("I don't know this guy at all");
        }
        
        
        if (number > 18){
            System.out.println("This is a adult");
        }
        
        else if (number > 12){
            System.out.println("This is a teenager");
        }
        
        else{
            System.out.println("This is a adult!!"); 
        }
        return 0;
         
     }// if name
     
}