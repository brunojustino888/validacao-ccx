
//Essa classe faz a validação do CPF ou CNPJ
public class ValidarCPF {
	
	boolean valido = false; 
	String metodoChamado;
	
	//No construtor que define se o número de imput é CPF ou CNPJ, para "chamar" o método correto
	public ValidarCPF(String numero){
		
		if (numero.length()==11){
			metodoChamado = "CPF"; 
			isCPF(numero);
		} else if (numero.length()==14){
			metodoChamado = "CNPJ";
			isCNPJ(numero);
		}else{
			valido = false;
		}
		
		
	}
	
	
	
	public boolean isCPF(String cpf){
		//Cálculo do 1º digito verificador
		String aux2 = null;
		int d1,d2 = 0;
		int resto = 0;
		int resto2 = 0;
		int soma = 0; 
		char[] n = cpf.toCharArray(); 
		
		for(int i=0;i<9;i++){
			soma += Character.getNumericValue(n[i])*(10-i); // convertendo cada char do array em int e multiplicando pelos respectivos valores de 1 a 9
		}
		
		if(soma%11<2){
			d1= 0;
		}else {
			resto = soma%11;
			d1 = 11 - resto ;
		}
		
		String aux = Integer.toString(d1); //convertendo o digito verificador em string, assim pode-se concaterna-la com o resto do cpf
		String cpfD1  = cpf.substring(0,9)+ aux; //adicionando o 1º digito verificador no cpf de 9 digitos
		
		//Cálculo do 2º digito verificador
		char[] n2 = cpfD1.toCharArray();
		int somas = 0;
		for(int i=0;i<10;i++){
			somas += Character.getNumericValue(n2[i])*(11-i); // convertendo cada char do array em int e multiplicando pelos respectivos valores de 1 a 9
		}
		
		if(somas%11<2){
			d2= 0;
		}else {
			resto2 = somas%11;
			d2 = 11-resto2;
		}
		
		int um = Character.getNumericValue(n[9]);
		int dois = Character.getNumericValue(n[10]);
		
		if((um == d1)&&(dois ==d2)){
			valido = true;			
		}else{
			valido = false;	
		}
		
		return valido;
	}
	
	
	
	public boolean isCNPJ(String cnpj){
		int d1,d2 = 0;
		int resto = 0;
		int resto2 = 0;
		int soma, soma2 = 0; 	
		char[] n = cnpj.toCharArray();
		
		
		soma = (Character.getNumericValue(n[0])* 5) + 
			   (Character.getNumericValue(n[1])* 4) + 
			   (Character.getNumericValue(n[2])* 3) +
			   (Character.getNumericValue(n[3])* 2) +
			   (Character.getNumericValue(n[4])* 9) +
			   (Character.getNumericValue(n[5])* 8) +
			   (Character.getNumericValue(n[6])* 7) +
			   (Character.getNumericValue(n[7])* 6) +
			   (Character.getNumericValue(n[8])* 5) +
			   (Character.getNumericValue(n[9])* 4) +
			   (Character.getNumericValue(n[10])* 3) +
			   (Character.getNumericValue(n[11])* 2) ;
				
		
			if(soma%11<2){
				d1= 0;
			}else {
				resto = soma%11;
				d1 = 11-resto;
			}
		
			
		soma2 =(Character.getNumericValue(n[0])* 6) + 
			   (Character.getNumericValue(n[1])* 5) + 
			   (Character.getNumericValue(n[2])* 4) +
			   (Character.getNumericValue(n[3])* 3) +
			   (Character.getNumericValue(n[4])* 2) +
			   (Character.getNumericValue(n[5])* 9) +
			   (Character.getNumericValue(n[6])* 8) +
			   (Character.getNumericValue(n[7])* 7) +
			   (Character.getNumericValue(n[8])* 6) +
			   (Character.getNumericValue(n[9])* 5) +
			   (Character.getNumericValue(n[10])* 4) +
			   (Character.getNumericValue(n[11])* 3) +
			   (d1 * 2);
			
			
			if(soma2%11<2){
				d2= 0;
			}else {
				resto = soma2%11;
				d2 = 11-resto;
			}
			
			
			if((Character.getNumericValue(n[12]) == d1)&(Character.getNumericValue(n[13]) ==d2)){
				valido = true;			
			}else{
				valido = false;	
			}
			
			return valido;
		}
	
	
	
	
	
	
	
	
}
