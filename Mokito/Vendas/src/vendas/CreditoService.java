package vendas;

public class CreditoService implements ICreditoService {

	@Override
	public double getLimiteCredito(String cpf) {
		System.out.println("Consultado administradora de cartões...");
		return 1500;
	}

}
