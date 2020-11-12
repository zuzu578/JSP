
public class Example1 {

	public static void main(String[] args) {
		A b1 =new B(20,5);
		b1.div();
		b1.sum();
	
}
}
class A{
	protected int a;
	protected int b;
	
		  A(){
		a=20;
		b=10;
		
		
	}
	void sum() {
		System.out.println(this.a+this.b);
	}
	void div() {
		System.out.println(this.a/this.b);
	}
}
class B extends A{
	private int p ;
	private int q ; 
	B(int x , int y){
		p = x;
		q = y;
	}
	void sum() {
		System.out.println(a+b);
		System.out.println(p+q);
	}
	void div() {
		System.out.println(a/b);
		System.out.println(p/q);
	}
}