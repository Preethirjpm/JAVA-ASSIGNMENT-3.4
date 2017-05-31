public class StaticVariableMethods {

	int a=10,b=2;
	static String name= "JAKAY";
	
	// non-static method inside you can use non static variable
	public void Add(){
		int c= a+b;
		System.out.println("This is Non Static Method: and Non Static variable values is :"+c);
	}
	
	//Static method inside u can't use static variable
	public static void display(){
		
		System.out.println("This is Static Methods: and Static variable values is :"+name);
	}
	public static void main(String[] args) {
		
		StaticVariableMethods obj1= new StaticVariableMethods();
		obj1.Add(); // Through object only u can access the non-static method and variable
		
		StaticVariableMethods.display();  // Static method and variable Directly u can access the methods and variale
		
	}
	
}