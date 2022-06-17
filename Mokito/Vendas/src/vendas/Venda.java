package vendas;

public class Venda {

	private Cliente cliente;
	private double valor;
	private ICreditoService creditoService;
	
	
	
	public Venda(Cliente cliente, double valor, ICreditoService credito) {
		super();
		this.cliente = cliente;
		this.valor = valor;
		this.creditoService = credito;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean checkout() {
		double limite; 
		limite = creditoService.getLimiteCredito(cliente.getCpf());
		if(valor > limite) {
			return false;
		}else {
			return true;
		}
	}
}
