package business;

import db.Roshambo;

public class Bart extends Player{
	
	public Bart() {
		this.setName("Bart");
	
	}


	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.ROCK;
	}

}
