package it.strazz.corso2014.patterns;

import it.strazz.corso2014.patterns.builder.Pizza;
import it.strazz.corso2014.patterns.builder.PizzaBuilder;
import it.strazz.corso2014.patterns.singleton.Singleton;

/**
 * Start for Pattern examples
 * 
 * @author f.strazzullo
 *
 */
public class Start 
{
    public static void main( String[] args )
    {
        singletonLauncher();
        builderLauncher();
    }

	private static void builderLauncher() {
		Pizza p1 = new PizzaBuilder().addMozzarella().addSalame().build();
		p1.inforna();
		
		try {
			Pizza p2 = new PizzaBuilder().addMozzarella().addPomodoro().build();
			p2.inforna();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void singletonLauncher() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance1 == instance2);
	}
}
