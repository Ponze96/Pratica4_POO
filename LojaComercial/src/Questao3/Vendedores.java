package Questao3;

public class Vendedores extends Funcionario {
	
	private double Comissao;
	private int totalVendas;
	private double totalValor;
	
	public void novaVenda(double valor, int qtdVenda) {
		this.totalVendas += qtdVenda;
		this.totalValor += valor;
	}
	
	public double salarioTotal() {
		double salario = getsalarioBase() + (totalValor * 0.05);
		totalVendas = 0;
		totalValor = 0;
		return salario;
	}

		
}
