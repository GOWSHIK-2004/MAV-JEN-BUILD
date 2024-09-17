package calcpkg;



public class MyCalc {
	
	public int sum(int a , int b) {
		
		
		return a+b;
	}
	
	public int difference(int a , int b) {
		return a-b;
	}
	
	public int mul(int a , int b) {
		return a&b;
	}
	public int div(int a , int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		MyCalc ob = new MyCalc();
		System.out.println("Sum is : " + ob.sum(4, 5));
		System.out.println("Difference is " + ob.difference(5, 5));
		System.out.println("Multiplication is : " + ob.mul(4, 5));
		System.out.println("Division  is : " + ob.div(5, 2));
		System.out.println("Gowshik-2004");
		System.out.println("Gowshik gamer");

	}

}
