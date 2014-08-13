package headfirst.adapter.ducks;

import headfirst.adapter.ducks.adapter.TurkeyAdapter;
import headfirst.adapter.ducks.interfaces.Duck;

public class Main {
	public static void main(String[] args) {

		System.out.println("The Turkey says...");
		WildTurkey turkey = new WildTurkey();
//		turkey.gobble();
//		turkey.fly();

//		System.out.println("\nThe Duck says...");
//		MallardDuck duck = new MallardDuck();
//		testDuck(duck);
//
		System.out.println("\nThe TurkeyAdapter says...");
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		testDuck(turkeyAdapter);
	}

	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
