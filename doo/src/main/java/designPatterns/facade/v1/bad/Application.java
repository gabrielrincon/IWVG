package designPatterns.facade.v1.bad;

import designPatterns.facade.v1.bad.subsystem.A;
import designPatterns.facade.v1.bad.subsystem.B;
import designPatterns.facade.v1.bad.subsystem.C;
import designPatterns.facade.v1.bad.subsystem.D;

public class Application {

	public void exec(){
		A a = new A();
		a.m1();
		a.m2();
		//...
		B b = new B();
		b.m3();
		b.m4(a);
		//...
		C c = new C();
		c.m5();
		//...
		D d = new D();
		d.m6(d);
		//...
		X x = new X();
		x.m7();
		//...
		Y y = new Y();
		y.m8();
	}
	
	public static void main(String[] args) {
		new Application().exec();
	}
}
