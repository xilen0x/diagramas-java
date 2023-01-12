package diagrams;

public class Sphere extends Shape{
	
	//---------------- ATRIBUTOS -------------------
	private double radius;


	//---------------- CONSTRUCTOR -------------------
	public Sphere() {}
	
	public Sphere(double radius) {
		this.setRadius(radius);
		System.out.println("***constructor Sphere***");
	}
	
	//---------------- METODOS SETTERS Y GETTERS ----------------

	public double getRadius() {
		return this.radius;
	}
	
//	public double getArea() {
//		
//		return 4 * Math.PI * Math.pow(this.radius,2);
//	}
	
	
	public void setRadius(double value) {

		// validación
		if (value < 0) {
			System.out.println("Valor invalido para el radio - Debe ingresar un valor mayor a 0");
		} else {
			this.radius = value;
		}
	}


	public double getVolume() {
		return (4.0 / 3.0) * Math.PI * Math.pow(this.radius,3);
	}

}
