package Questao4;
import javax.swing.JOptionPane;
import javax.swing.Popup;

public class Main {

	public static void main(String[] args) {

		popular[] carros = new Popup[100];
		int cont = 0;
		
		do{
		
			String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Preço \n(3) Sair");
			
			switch (op) {
				case "1":
					
					int PB = Integer.parseInt( JOptionPane.showInputDialog("Qual o preço base? "));
					boolean ABS = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer abs? \n Sim (1) \n Não (0)"));
					boolean AB = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer airbag? \n Sim (1) \n Não (0)"));
					boolean AL = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer alarme? \n Sim (1) \n Não (0)"));
					boolean SOM = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer som? \n Sim (1) \n Não (0)"));
					boolean CE = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer conjunto Eletrico? \n Sim (1) \n Não (0)"));
					boolean CB = Boolean.parseBoolean( JOptionPane.showInputDialog("Quer computador Bordo? \n Sim (1) \n Não (0)"));
					
					carros[cont] = new Popup(PB, ABS, AB, AL, SOM, CE, CB);
					
					cont++;
					break;
				case "2":
					
					JOptionPane.showMessageDialog(null, "Preço final: "+ carros[cont - 1].calcularPrecoFinalPopular());
					
					break;
				case "3":
					JOptionPane.showMessageDialog(null, "Obrigado!");
					cont = 1000;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Resposta Incorreta");
			}
			
			
		}while(cont != 1000);
	}


}
