package business;

import db.Roshambo;

public abstract class Player  {
	
	private Roshambo value;
	private String name;
	public Roshambo getValue() {
		return value;
	}
	public void setValue(Roshambo value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Roshambo generateRoshambo();
	

}
