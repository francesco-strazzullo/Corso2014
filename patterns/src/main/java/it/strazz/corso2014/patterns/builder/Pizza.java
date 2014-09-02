package it.strazz.corso2014.patterns.builder;

public class Pizza {
	Pizza(){}
	
	private Pomodoro pomodoro;
	private Mozzarella mozzarella;
	private Salame salame;
	
	public Pomodoro getPomodoro() {
		return pomodoro;
	}

	public void setPomodoro(Pomodoro pomodoro) {
		this.pomodoro = pomodoro;
	}

	public Mozzarella getMozzarella() {
		return mozzarella;
	}

	public void setMozzarella(Mozzarella mozzarella) {
		this.mozzarella = mozzarella;
	}

	public Salame getSalame() {
		return salame;
	}

	public void setSalame(Salame salame) {
		this.salame = salame;
	}

	public void inforna(){
		System.out.println("Pomodoro " + String.valueOf(pomodoro));
		System.out.println("Mozzarella " + String.valueOf(mozzarella));
		System.out.println("Salame " + String.valueOf(salame));
	}
}
