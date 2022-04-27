package Questao3;

public class Administrativo extends Funcionario {
	
	private double horasExtra;
	
	public double salarioTotal() {
		double salario = getsalarioBase() + (horasExtra * (this.getsalarioBase()/100 ));
		horasExtra = 0;
		return salario;
	}

}
