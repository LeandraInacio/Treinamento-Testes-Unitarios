package pessoaCoverage;

public class Pessoa {

	public void verificarIdade(int x) {
		if(x >= 60) {
			System.out.println("Essa pessoa � um senhor");
		}else if(x >= 21) {
			System.out.println("Essa pessoa � um adulto");
		}else if(x >= 14) {
			System.out.println("Essa pessoa � um jovem");
		}else {
			System.out.println("Essa pessoa � uma crian�a");
		}
	}
}
