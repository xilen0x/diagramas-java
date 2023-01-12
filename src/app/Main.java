package app;
// se debe importar pq la clase esta en otro paquete 
import diagrams.*;


public class Main {

	public static void main(String[] args) {

		// ------------------------- COLORES -------------------------
		Color color1 = new Color(200, 160, 160);
		System.out.println(color1.toString());
		//color1.setBlue(100);//modificando el azul
		//System.out.println(color1.toString());
		Color color2 = new Color();
		System.out.println(color2.toString());

		// ------------------------- FIGURAS -------------------------
		
		// - Cuadrado
		Square square = new Square(2.0, color1, color2);
		//square.setBackgroundColor(color1);
		//square.setColor(color2);
		System.out.printf("Color del cuadrado: %s \n", 
				square.getBackgroundColor().toString());
		System.out.printf("Area del cuadrado con longitud de %.2f es: %.2f \n",
				square.getSide(), square.getArea());
		//System.out.printf("El color es: %f", color.getBlue());

		
		// - Rectangulo
		Rectangle rectangle = new Rectangle(2.0, 3.0);
		rectangle.setBackgroundColor(color1);
		rectangle.setColor(color2);
		//rectangle.setBase(2.0);
		//rectangle.setHeight(3.0);
		System.out.printf("Color del rectangulo: %s \n", 
				rectangle.getBackgroundColor().toString());
				//square.getBackgroundColor().toString());
		System.out.printf("Area del rectángulo para una base de %.2f y una altura de %.2f es: %.2f \n",
				rectangle.getBase(), rectangle.getHeight(), rectangle.getArea());

		
		// - Circulo
		Circle circle = new Circle(5.5);
		circle.setBackgroundColor(color1);
		circle.setColor(color2);
		//circle.setRadius(5.5);
		System.out.printf("Color del circulo: %s", circle.getBackgroundColor().toString());
		System.out.printf("Area de un circulo con radio de %.2f es: %.2f \n", circle.getRadius(), circle.getArea());

		
		// - Esfera
		Sphere sphere = new Sphere(7.8);
		sphere.setColor(color2);
		//sphere.setRadius(7.8);
		System.out.printf("Color de la esfera: %s \n", 
				sphere.getColor().toString());
		System.out.printf("Volumen de una esfera con radio de %.2f es: %.2f: \n", sphere.getRadius(), sphere.getVolume());
		
	}

}
