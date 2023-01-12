package diagrams;

public class Square extends Shape{
	
	//---------------- ATRIBUTOS -------------------
	private final double side;

	
	
	//---------------- CONSTRUCTOR -------------------
	//public Square() {}
	
	public Square(double sideX, Color backgroundX, Color colorX) {
		if(sideX < 0) {
			
			this.side = 1.0; 
			System.out.println("***constructor cuadrado***");
		}else {
			this.side = sideX; 
		}
	}
	
	//---------------- METODOS SETTERS Y GETTERS ----------------

	
	public double getPerimeter() {
		
		return this.side * 4;
	}
	
	public double getSide() {
		return this.side;
	}
	
//	public void setSide(double value) {
//		
//		if(value < 0) {
//			System.out.println("Valor invalido para el lado. - Debe ingresar un valor mayor a 0");	
//		}
//		else {
//			this.side = value;
//			//System.out.println("Area del cuadrado es: " + getArea());
//
//		}
//	}

	//---------------- BEHAVIORS ----------------

//	public double getArea() {
//		 
//		return side * side;
//	}
	
}
