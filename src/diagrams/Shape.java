package diagrams;

public class Shape {

	private Color backgroundColor;// color de fondo
	private Color color;//color de las lineas
	
	//---------------- BEHAVIORS ---------------------
//	public double getArea() {
//		 
//		return 1.0;
//	}

	//---------------- METODOS SETTERS Y GETTERS ----------------
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	public Color getColor() {
		return color;
	}

	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
