package verificador;

import javax.swing.JOptionPane;

public class VerificadorDeSenha {

	public static void main(String[] args) {
		System.out.print("Digite a Senha: ");
		String senha = JOptionPane.showInputDialog("Digite a Senha: ");
		int contador=1;
		
		while(!senha.equals("senha123") && contador<=2) {
		senha = JOptionPane.showInputDialog("Senha Incorreta, Tente Novamente: \nTentativas Restantes: " +(3-contador));
		contador++;
		}
		System.out.println("");
		if(senha.equals("senha123")){
			JOptionPane.showInputDialog(null, "Acesso Permitido!");	
		} else {
			JOptionPane.showInputDialog(null, "Acesso Negado! (Senha Incorreta)");	
		}
		

	}
}
