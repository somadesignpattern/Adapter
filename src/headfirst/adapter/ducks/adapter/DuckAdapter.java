package headfirst.adapter.ducks.adapter;

import headfirst.adapter.ducks.interfaces.Duck;
import headfirst.adapter.ducks.interfaces.Turkey;

import java.util.Random;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {
		     duck.fly();
		}
	}
}
