package application;



import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enuns.Collor;

public class Program {

	public static void main(String[] args) {
		AbstractShape s1 = new Circle(Collor.Black, 2.0);
		AbstractShape s2 = new Rectangle(Collor.White, 3.0 ,4.0);
		
		System.out.println("Circle color: " + s1.getCollor());
		System.out.println("Circle area : " + String.format("%.3f ", s1.area()));
		System.out.println("Rectangle color: " + s2.getCollor());
		System.out.println("Rectangle area : " + String.format("%.3f ", s2.area()));
		

	}

}
