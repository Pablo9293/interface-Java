package model.entities;
import model.enuns.Collor;

public class Rectangle extends AbstractShape { //Herda o AbstractShape
	private Double width;
	private Double heigth;
	public Rectangle(Collor collor, Double width, Double heigth) {
		super(collor);
		this.width = width;
		this.heigth = heigth;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeigth() {
		return heigth;
	}
	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}
	//sobrescreve a opercao area
	@Override
	public double area() {
		return width * heigth;
	}
	
	

}
