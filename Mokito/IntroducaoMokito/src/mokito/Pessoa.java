package mokito;

public class Pessoa {

	private int idade;
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void falar() {
		System.out.println("Falando...");
	}
	

}
