package classCall;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo3 d=new Demo3();
		d.m2();                                  //instance to static using object
	}
	static void m1() {
		System.out.println("in m1 method");
	}
    void m2() {
    	System.out.println("in m2 method");
    	m1();									//static to instance directly
    }
}
