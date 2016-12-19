package co.nontster.test;

public class MyComponent {
	private final SomeService service;

	public MyComponent(SomeService service) {
		this.service = service;
	}
	
	public String call(){
		return this.service.call();
	}
	
}
