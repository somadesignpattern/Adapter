package headfirst.adapter.ducks.adapter;

import headfirst.adapter.ducks.interfaces.Duck;
import headfirst.adapter.ducks.interfaces.Turkey;


public class TurkeyAdapter implements Duck {
	Turkey turkey;
 
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
    
	public void quack() {
		turkey.gobble();
	}
  
	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
