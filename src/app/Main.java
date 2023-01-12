package app;
import diagrams.*;


public class Main {

	public static void main(String[] args) {

		// ------------------------- COLORES -------------------------
		Color color1 = new Color(200, 160, 160);
		Color color2 = new Color();
		System.out.println("\n--------------- COLORES ---------------");
		System.out.println("\nColor original 1(CON PARAMS): " + color1.toString());
		System.out.println("\nColor original 2(SIN PARAMS): " + color2.toString() + "\n");

		// ------------------------- FIGURAS -------------------------
		
		System.out.println("\n--------------- CUADRADO ---------------");
		Square square = new Square(2.0, color1, color2);
		square.setBackgroundColor(color1);
		System.out.printf("\nColor cuadrado: %s \n", square.getBackgroundColor().toString());
		System.out.printf("\nArea cuadrado con longitud de %.2f es: %.2f \n\n",
				square.getSide(), square.getArea());


		
		System.out.println("\n--------------- RECTANGULO ---------------");
		Rectangle rectangle = new Rectangle(2.0, 3.0);
		rectangle.setBackgroundColor(color1);
		rectangle.setColor(color2);
		System.out.printf("\nColor rectangulo: %s \n", rectangle.getBackgroundColor().toString());
		System.out.printf("\nArea rectángulo de base %.2f y altura %.2f es: %.2f \n\n",
				rectangle.getBase(), rectangle.getHeight(), rectangle.getArea());

		
		System.out.println("\n--------------- CIRCULO ---------------");
		Circle circle = new Circle(5.5);
		circle.setBackgroundColor(color1);
		circle.setColor(color2);
		System.out.printf("\nColor circulo: %s \n", circle.getBackgroundColor().toString());
		System.out.printf("\nArea circulo con radio de %.2f es: %.2f \n\n", circle.getRadius(), circle.getArea());

		
		System.out.println("\n--------------- ESFERA ---------------");
		Sphere sphere = new Sphere(7.8);
		sphere.setColor(color2);
		System.out.printf("\nColor esfera: %s \n", sphere.getColor().toString());
		System.out.printf("\nVolumen esfera con radio de %.2f es: %.2f: \n", sphere.getRadius(), sphere.getVolume());
		System.out.printf("\nArea esfera: %.2f", sphere.getArea());
		
	}

}
