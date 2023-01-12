package diagrams;

//------------------------ ENCAPSULAMIENTO ----------------------------
public class Rectangle extends Shape{
	
	//---------------- ATRIBUTOS -------------------
	private double base;//para encapsular debe ser private
	private double height;

	
	//---------------- CONSTRUCTOR -------------------
	//sin parametros
	public Rectangle() {}
	
	//con un parametro
	public Rectangle(double base) {
		this.setBase(base);
	}
	//con dos parametros
	public Rectangle(double base, double height) {
		this.setBase(base);
		this.setHeight(height);
		System.out.println("***constructor Rectangle***");// esta linea no va; es solo para ver q el constructor se ejecuta
	}
	
	//---------------- METODOS SETTERS Y GETTERS ----------------
	public void setBase(double value) {
		// validación
		if(value < 0) {
			System.out.println("Valor invalido para la base - Debe ingresar un valor mayor a 0");	
		}
		else {
			base = value;
		}
	}
	
	// Metodo GETTER q devuelve el atributo de altura
	public double getHeight() {
		return this.height;
	}

	// Metodo GETTER q devuelve el atributo de la base
	public double getBase() {
		return this.base;
	}
	
	//Metodo SETTER y validación de dato altura
	public void setHeight(double value) {
		// validación
		if(value < 0) {
			System.out.println("Valor invalido para la altura- Debe ingresar un valor mayor a 0");	
		}
		else {
			this.height = value;
		}
	}
	


	// ---------------- Cálculo del área y perímetro------------------
//	public double getArea() {
//				 
//		return base * height;
//		
//	}
	
	public double getPerimeter() {
		
		return (this.base *2) + (this.height * 2);
	}
	
}