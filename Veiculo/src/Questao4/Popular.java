package Questao4;

public class Popular extends Automovel {

	Popular(double precobase, boolean abs, boolean airBag, boolean alarme, boolean som, 
			boolean conjuntoEletrico, boolean computadorBordo){
		
		super(computadorBordo, abs, airBag, alarme, som, conjuntoEletrico, precobase);
		
	
	}
		
		public double calcularPrecoFinalPopular() {
			
			setPrecoFinal(getPrecoFinal());
			
			if(isAbs()) {
				setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.15));
			}
			
			if(isAirBag()) {
				setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.1));
			}
			
			if(isAlarme()) {
				setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.03));
			}
			
			if(isSom()) {
				setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.02));
			}
			
			if(isConjuntoEletrico()) {
				setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.05));
			}
			
			if(isComputadorBordo()) {
				setPrecoFinal(getPrecoFinal() + (getPrecoBase() * 0.1));
			}

			return getPrecoFinal();
		}
		
	
}	
