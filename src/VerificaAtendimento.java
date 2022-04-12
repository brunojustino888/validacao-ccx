import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class VerificaAtendimento {

	public static void main(String[] args) {

		SimpleDateFormat mascaraData = new SimpleDateFormat("dd-MM-yyyy");
		Date data = new Date();
		String s = mascaraData.format(data);
		System.out.println(s);
		String array[] = s.split("-");
				
		int dia = 0;
		int mes = 0;
		int ano = 0;
		
		dia =Integer.parseInt(array[0]);
		mes =Integer.parseInt(array[1]);
		ano =Integer.parseInt(array[2]);
		
		Calendar calendario = new GregorianCalendar(ano, mes -1 , dia);  
	    int diaSemana = calendario.get(Calendar.DAY_OF_WEEK); 
	    String DIA = null;   
	    		
	    		switch (diaSemana) {  
	       	    case 1: DIA = "Domingo";  
	    	    case 2: DIA = "Segunda";  
	    	    case 3: DIA = "Terça";  
	    	    case 4: DIA = "Quarta";  
	    	    case 5: DIA = "Quinta";  
	    	    case 6: DIA = "Sexta";  
	    	    case 7: DIA = "Sábado";  
	    	     
	    	  }  
	    System.out.println(DIA);
	    
	    
	    SimpleDateFormat mascaraHora = new SimpleDateFormat("HH-mm");
		Date hora = new Date();
		String ss = mascaraHora.format(hora);
		System.out.println(ss);
		array = ss.split("-");
		int horas = Integer.parseInt(array[0]);
		int minutos = Integer.parseInt(array[1]);
	    boolean atendimento= false;
	    String saudacao = "";
	    String ligacao = "";
		
	    if ((horas >= 7)&&(horas <=11)) {
			saudacao = "BomDia";
	    }
	    if ((horas >= 12)&&(horas <=6)) {
	    	saudacao = "BoaTarde";
	    }
	    if ((horas >= 12)&&(horas <=6)) {
			saudacao = "BoaTarde";
	    }
	    if(diaSemana==7){
	    	
	    }
	    
	    
	    if((diaSemana!=1)||(diaSemana!=7)){
	    	    	    	 
	    }	
	    	
	    	System.out.println("Hoje terá atendimento "+atendimento);
	    	
	    }
	    
	    
	    
	}


