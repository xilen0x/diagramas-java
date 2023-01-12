package diagrams;

public class Circle extends Shape{
	
	//---------------- ATRIBUTOS -------------------
	private double radius;

	//---------------- CONSTRUCTOR -------------------
	public Circle() {}
	
	public Circle(double radius) {
		this.setRadius(radius);
		System.out.println("***constructor circle***");
	}
	
	
	public double getRadius() {
		return radius;
	}

	// METODOS
//	public double getArea() {
//		 
//		return Math.PI * this.radius * this.radius;	
//	}
	public double getPerimeter() {
		
		return 2 * Math.PI * this.radius;
	}
	
	//---------------- METODOS SETTERS Y GETTERS ----------------
	public void setRadius(double value) {
		
		// validación
		if(value < 0) {
			System.out.println("Valor invalido para el radio- Debe ingresar un valor mayor a 0");	
		}
		else {
			this.radius = value;
		}
	}
	

}
