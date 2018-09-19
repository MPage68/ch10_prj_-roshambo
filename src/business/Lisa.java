package business;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import db.Roshambo;

public class Lisa extends Player {
	
	public Lisa() {
		this.setName("Lisa");
	}

	@Override
	public Roshambo generateRoshambo() {
		Random r = new Random();
		List<Roshambo> roshambos = Arrays.asList(Roshambo.ROCK, Roshambo.PAPER, Roshambo.SCISSORS);
		return roshambos.get(r.nextInt(roshambos.size()));
	 
	}

}
