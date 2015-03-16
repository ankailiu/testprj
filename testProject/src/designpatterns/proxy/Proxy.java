package designpatterns.proxy;

public class Proxy implements Subject {
	
	Subject subject = new RealSubject();

	@Override
	public void operation() {
		System.out.println("Before operate");
		subject.operation();
		System.out.println("After operate");
	}

}
