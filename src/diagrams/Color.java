package diagrams;

public class Color {

	//---------------- ATRIBUTOS -------------------
	private final int red;
	private final int green;
	private final int blue;
	
	public static final int MAX = 255;
	public static final int MIN = 0;
	
	//---------------- CONSTRUCTOR -------------------
		//Constructor que asigna los valores por defecto
		public Color() {
			this.red = Color.MAX;
			this.green = Color.MAX;
			this.blue = Color.MAX;
		}
	
		public Color(int red, int green, int blue) {
		
		if (validaColor(red)) {
			this.red = red;
		}else {
			this.red = Color.MAX;
			}
		if (validaColor(green)) {
			this.green = green;
		}else {
			this.green = Color.MAX;
			}
		if (validaColor(blue)) {
			this.blue = blue;
		}else {
			this.blue = Color.MAX;
			}
		}
	
		//---------------- METODOS SETTERS Y GETTERS ----------------
	public int getRed() {
		return red;
	}

	
	public int getGreen() {
		return green;
	}
	
	public int getBlue() {
		return blue;
	}
	
	
	// BEHAVIORs
	public String toString() {
		return "(Red: " + this.red + 
		    	" Green: "+ this.green +
				" Blue: "+ this.blue + ")";
	}
	
	//VALIDACION del color
	private boolean validaColor(int value) {
		
		if(value < Color.MIN || value > Color.MAX) {
			System.out.printf("Valor %d invalido\n", value);
			return false;
		}else {
			return true;
		}
	}
}
