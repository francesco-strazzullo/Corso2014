package it.strazz.corso2014.patterns.dao;

import java.util.List;

public interface PizzaDao {
	public List<Pizza> getAll();
	public Pizza store(Pizza pizza);
}
