package model.entities;
import model.enuns.Collor;

public class Circle extends AbstractShape{ //Herda o abstractshape
	private Double radius;

	public Circle(Collor collor, Double radius) {
		super(collor);
		this.radius = radius;
	}
	

	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}

   // Classe sobrescrevendo operacao area
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	

}
