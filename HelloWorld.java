public class HelloWorld{
	public static void main (String[] agrgs){
		int num = 50;
		String name = "Jack";
		Float deci = 9.9999f;
		boolean isFun = true;
		char symbol = '$';
		
		//using print line method
		System.out.println ("Hello World, This is my First Java Program");
		System.out.println("Learning java is fun"); 
		
		//using print method
		System.out.print("The print method should be used to accept input");
		System.out.print("Another print Method");
		
		//using print of method
		System.out.printf("I bought %d quantity of bread",num);
		System.out.printf("My name is %s%n",name);
		System.out.printf("Your balance is %c%.2f%n",symbol,deci);
		System.out.printf("is java fun? %b%n",isFun);
		System.out.print("Do you enjoy learning \"Java\"");
	}
}