package headfirst.adapter.ducks;

import headfirst.adapter.ducks.interfaces.Duck;


public class MallardDuck implements Duck {
	public void quack() {
		System.out.println("Quack");
	}
 
	public void fly() {
		System.out.println("I'm flying");
	}
}
