public class Cubo extends Cuadrado {
	private float volumen;
	public Cubo(float lado) {
		super(lado);
		this.volumen=0;
	}
	public void calcularVolumen() {
		this.volumen=(float) Math.pow(getLado(), 3);
	}
	public float getVolumen() {
		return volumen;
	}
	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}
	

}
