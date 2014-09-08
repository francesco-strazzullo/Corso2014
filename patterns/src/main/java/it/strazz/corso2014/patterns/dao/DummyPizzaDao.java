package it.strazz.corso2014.patterns.dao;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;

public class DummyPizzaDao implements PizzaDao {

	private List<Pizza> pizzas = Lists.newArrayList(new Pizza(0, "Margherita"),new Pizza(1,"Diavola"));
	
	public List<Pizza> getAll() {
		return Collections.unmodifiableList(pizzas);
	}

	public Pizza store(Pizza pizza) {
		if(pizza.getId() == null){
			pizza.setId(pizzas.size());
			this.pizzas.add(pizza);
		}else{
			pizzas.set(pizza.getId(), pizza);
		}
		
		return pizza;
		
	}

}
