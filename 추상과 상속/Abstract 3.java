
public class Example1 {

	public static void main(String[] args) {
		Pc p2 = new Pc2();
		if(p2 instanceof Pc2) {
			Pc2 p12 =(Pc2)p2;
		}
		 p2.turnOn();
		 p2.turnOff();
		p2.display() ;
		p2.typing();
		
	}
	
}

abstract class Pc{
	//추상메서드 ===>body(X)//
	//추상메서드에서는 Private 쓸수없다.//
	//Private 를 쓰게 되면 상속자체를 못해버려서 abstract의 본질이 깨져버리기 때문이다.//
	abstract protected void display();
	abstract protected void typing();
	//일반메서드//
	public void turnOn() {
		System.out.println("power on");
	}
	public void turnOff() {
		System.out.println("power off");
	}
}
 class Pc2 extends Pc{
	 protected void display() {
		 System.out.println("display");
	}
	 protected void typing() {
		 System.out.println("typing");
	 }
}