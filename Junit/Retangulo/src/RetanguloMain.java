
public class RetanguloMain {

	public static void main(String[] args) {
		RetanguloTeste teste = new RetanguloTeste();
		boolean resultado;
		
		resultado = teste.testeCalcularArea();
		System.out.println("teste Calcular Area = "+ resultado);
		
		resultado = teste.testeCalcularPerimetro();
		System.out.println("teste calcular perimetro = "+ resultado);
	}
}
