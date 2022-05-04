package Questao4;
import javax.swing.JOptionPane;
import javax.swing.Popup;

public class Main {

	public static void main(String[] args) {

		Popular[] carros = new Popular[100];
		int cont = 0;
		String resposta;
		boolean ABS = false, AB = false, AL = false, SOM = false, CE = false, CB = false;
		
		do{
		
			String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Preço \n(3) Sair");
			
			switch (op) {
				case "1":
					
					int PB = Integer.parseInt( JOptionPane.showInputDialog("Qual o preço base? "));
					resposta = JOptionPane.showInputDialog("Gostaria de colocar abs? \n Sim (1) \n Não (0)");
					System.out.println(resposta);
					if(resposta.equals("1"))
						ABS = true;
					resposta = JOptionPane.showInputDialog("Gostaria de colocar airbag? \n Sim (1) \n Não (0)");
					if (resposta.equals ("1"))
						AB = true;
					resposta = JOptionPane.showInputDialog("Gostaria de colocar alarme? \n Sim (1) \n Não (0)");
					if (resposta.equals("1"))
						AL = true;
					resposta = JOptionPane.showInputDialog("Gostaria de colocar som? \n Sim (1) \n Não (0)");
					if (resposta.equals("1"))
						SOM = true;
					resposta = JOptionPane.showInputDialog("Gostaria de colocar conjunto elétrico? \n Sim (1) \n Não (0)");
					if (resposta.equals("1"))
						CE = true;
					resposta = JOptionPane.showInputDialog("Gostaria de colocar computador de bordo? \n Sim (1) \n Não (0)");
					if (resposta.equals ("1"))
						CB = true;						
					
					carros [cont] = new Popular(PB, ABS, AB, AL, SOM, CE, CB);
					System.out.println(carros[cont].isAbs());
					
					cont++;
					break;
				case "2":
					System.out.println(carros[cont-1].isAbs());
					JOptionPane.showMessageDialog(null, "Preço final: "+ carros[cont - 1].calcularPrecoFinalPopular());
					
					break;
				case "3":
					JOptionPane.showMessageDialog(null, "Obrigado!");
					cont = 100;
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Resposta Incorreta");
			}
			
			
		}while(cont != 100);
	}


}
