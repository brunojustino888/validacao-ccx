import javax.swing.JOptionPane;


public class ValidarCPFTest {
 
	public static void main(String[] args) {
 
		
		
		String imput = JOptionPane.showInputDialog(null, "Digite o seu CPF ou CNPJ da sua empresa. \nExemplo: 12345678901","Valida��o do CPF",3);
		
		ValidarCPF a = new ValidarCPF(imput);
		
		
		if(a.valido){
			JOptionPane.showMessageDialog(null, "N�mero de "+a.metodoChamado+" V�lido!","Valida��o do CPF/CNPJ",1);
		}else {
			JOptionPane.showMessageDialog(null, "N�mero de "+a.metodoChamado+" Inv�lido!","Valida��o do CPF/CNPJ",0);
		}
		
		
	}

}
