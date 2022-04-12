import javax.swing.JOptionPane;


public class ValidarCPFTest {
 
	public static void main(String[] args) {
 
		
		
		String imput = JOptionPane.showInputDialog(null, "Digite o seu CPF ou CNPJ da sua empresa. \nExemplo: 12345678901","Validação do CPF",3);
		
		ValidarCPF a = new ValidarCPF(imput);
		
		
		if(a.valido){
			JOptionPane.showMessageDialog(null, "Número de "+a.metodoChamado+" Válido!","Validação do CPF/CNPJ",1);
		}else {
			JOptionPane.showMessageDialog(null, "Número de "+a.metodoChamado+" Inválido!","Validação do CPF/CNPJ",0);
		}
		
		
	}

}
