
public class Rectangulo_dtb extends FiguraGeometrica_dtb {
	/**
	 * autor:Daniel Terol Barbero, v:1.2, 
	 */
	private double l1;
	private double l2;
	
	/**
	 * creador de la clase rectangulo.
	 * @param tipoFigura tipo de la figura.
	 * @param lG un lado.
	 * @param lP otro lado.
	 */
	public Rectangulo_dtb(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * calcula el area.
	 */
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * calcula el perimetro.
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
