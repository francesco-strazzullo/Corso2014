package it.strazz.corso2014.patterns.dao;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;


public class PizzaService {
	//NB: use IoC
	private PizzaDao dao = new DummyPizzaDao();
	private static final PizzaService INSTANCE = new PizzaService();

	private PizzaService() {
	}

	public static PizzaService getInstance() {
		return INSTANCE;
	}
	
	public List<Pizza> list(){
		return dao.getAll();
	}
	
	public Pizza store(Pizza pizza){
		//Validazione
		Preconditions.checkArgument(!Strings.isNullOrEmpty(pizza.getName()));
		return dao.store(pizza);
	}
}
