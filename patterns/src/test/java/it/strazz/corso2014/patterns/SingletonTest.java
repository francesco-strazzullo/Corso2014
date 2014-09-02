package it.strazz.corso2014.patterns;

import it.strazz.corso2014.patterns.singleton.Singleton;
import junit.framework.TestCase;

public class SingletonTest extends TestCase {
	public void test(){
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		assertTrue(singleton1 == singleton2);
	}
}
