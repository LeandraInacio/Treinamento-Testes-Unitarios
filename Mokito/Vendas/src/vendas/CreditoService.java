package vendas;

public class CreditoService implements ICreditoService {

	@Override
	public double getLimiteCredito(String cpf) {
		System.out.println("Consultado administradora de cart�es...");
		return 1500;
	}

}
