package it.strazz.corso2014.patterns.activerecord;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.Lists;

public class Pizza {
	
	private static List<Pizza> pizzas = Lists.newArrayList(new Pizza(0, "Margherita"),new Pizza(1,"Diavola"));
	private Integer id;
	private String name;
	
	public static List<Pizza> getAll() {
		return Collections.unmodifiableList(pizzas);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Pizza(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + "]";
	}
	
	public void store(){
		if(this.getId() == null){
			this.setId(pizzas.size());
			pizzas.add(this);
		}else{
			pizzas.set(this.getId(), this);
		}
	}
	
}
