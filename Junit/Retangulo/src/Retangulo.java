
public class Retangulo {
	
	private int base;
	private int altura;
	
	public Retangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	//Métodos 
	
	public int calcularArea() {
		return base*altura;
	}
	
	public int calcularPerimetro() {
		return 2*base+2*altura;
	}
	
	
}
