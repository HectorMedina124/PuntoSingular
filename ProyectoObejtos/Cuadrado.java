public class Cuadrado {
	private float perimetro;
	private float area;
	private float lado;
	public Cuadrado(float lado) {
		this.perimetro=0;
		this.area=0;
		this.lado=lado;
	}
	public float getPerimetro() {
		return perimetro;
	}
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	
	public void calcularPerimetro() {
		this.perimetro=lado*4;
	}
	public void calcularArea() {
		this.area=(float) Math.pow(lado, 2);
	}
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	

}
