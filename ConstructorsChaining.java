public class ConstructorsChaining {
	
	int a;
	int b;
	int c;
	
	public ConstructorsChaining() {
		
		System.out.println("Default Constructor");
	}
	
	ConstructorsChaining(int a){
		this();
		this.a=a;
		System.out.println("Single arugument Parameterized Constructor ");
	}
	ConstructorsChaining(int a,int b){
		this(a);
		this.b=b;
		
		System.out.println("two arugument Parameterized Constructor ");
	}

	ConstructorsChaining(int a,int b, int c){
		this(a,b);
		this.c =c;
		System.out.println("Three arugument Parameterized Constructor ");
	}
	
	void display(){
		System.out.println("After Constructor execute a,b,c values is :"+a+","+","+b+","+c);
	}
	
	public static void main(String[] args) {
		ConstructorsChaining obj = new ConstructorsChaining(2,4,5);
		obj.display();
	}
}