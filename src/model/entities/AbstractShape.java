package model.entities;

import model.enuns.Collor;

public abstract class AbstractShape implements Shape { // Realiza o abstracte shape
	private Collor collor;

	public AbstractShape(Collor collor) {
		this.collor = collor;
	}

	public Collor getCollor() {
		return collor;
	}

	public void setCollor(Collor collor) {
		this.collor = collor;
	}
	
	
	

}
