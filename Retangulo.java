package entidades;

public class Retangulo {
	public double base;
	public double altura;
	
	public double area() {
		return base*altura;
				}
	public double perimetro() {
		return (base+altura)*2;}
	
	
	public double diagonal() {
		return Math.sqrt(base*base+altura*altura);}
	
	
	
	
	public String toString() {return "AREA = " + String.format("%.2f",area());}
	public String toString1() {return "PERIMETRO = " + String.format("%.2f",perimetro());}
	public String toString2() {return "DIAGONAL = "+ String.format("%.2f",diagonal());}
	
				
}
