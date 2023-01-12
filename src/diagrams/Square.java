package diagrams;

public class Square extends Shape{
	
	//---------------- ATRIBUTOS -------------------
	
	private final double side;

	
	
	//---------------- CONSTRUCTOR -------------------
	
	//public Square() {}
	
	public Square(double sideX, Color backgroundX, Color colorX) {
		if(sideX < 0) {
			
			this.side = 1.0; 
			//System.out.println("***constructor cuadrado***");
			System.out.println("Valor invalido para el lado. - Debe ingresar un valor mayor a 0");
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
	

	//---------------- BEHAVIORS ----------------

	public double getArea() {
		 
		return side * side;
	}
	
}
