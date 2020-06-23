import javax.swing.*;

public class Login {
	public String email;
	public String senha;
	
	public Login() {
		email = JOptionPane.showInputDialog("Digite Seu e-mail!");
		senha = JOptionPane.showInputDialog("Digite Sua senha");
	}
	
	public boolean verificaSenha(String emailTeste, String senhaTeste) {
		if ( (emailTeste == "g@g.com") || (senhaTeste == "123" )) {
			return true;			
		} 
		return false;
	}

	public static void main(String args[]) {
		
	}
}
