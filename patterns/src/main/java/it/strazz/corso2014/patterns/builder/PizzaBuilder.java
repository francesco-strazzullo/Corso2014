package it.strazz.corso2014.patterns.builder;

public class PizzaBuilder {
	private boolean mozzarellaAdded = false;
	private boolean pomodoroAdded = false;
	private boolean salameAdded = false;
	
	public PizzaBuilder addMozzarella(){
		mozzarellaAdded = true;
		return this;
	}
	
	public PizzaBuilder addPomodoro(){
		if(mozzarellaAdded){
			throw new RuntimeException("Non mettere il pomodoro dopo la mozzarella");
		}
		pomodoroAdded = true;
		return this;
	}
	
	public PizzaBuilder addSalame(){
		salameAdded = true;
		return this;
	}
	
	public Pizza build(){
		Pizza pizza = new Pizza();
		
		if(mozzarellaAdded){
			pizza.setMozzarella(new Mozzarella());
		}
		
		if(pomodoroAdded){
			pizza.setPomodoro(new Pomodoro());
		}
		
		if(salameAdded){
			pizza.setSalame(new Salame());
		}
		
		return pizza;
	}
}
