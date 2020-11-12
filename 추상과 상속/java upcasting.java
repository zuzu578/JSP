
public class new2 {

	public static void main(String[] args) {
		//upcasting//
		//a는 상위클래스//
		//b는 하위클래스//
		//b가 a한테 모든것을 상속받으면서 a의 모든 기능을 사용할수있게된다.//
		//때문에 b는 b자기자신이면서도 b는 a가 될수있다.//
		//때문에 b b1 = new b(); 도 가능하고 a b1 = new b(); 이것또한가능하다//
		//단 b b1 = new a() 이것은 불가능하다 왜냐하면 b는 a로부터 모든것을 상속받았기때문이다.//
		a b1= new b();
		b1.Running();
}
}

class a{
	int a ;
	int b; 
	int c;
	a(){
		a= 0 ;
		b= 2;
		c= 4;
		
	}
	void Running() {
		System.out.println(a+b+c);
	}
	
}
class b extends a{
	int d;
	b(){
		d=10;
	}
	void Running() {
		System.out.println(a+b+c+d);
	}
	
}
 