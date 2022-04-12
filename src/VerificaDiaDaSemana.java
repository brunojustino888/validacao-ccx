import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class VerificaDiaDaSemana {

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
	}

}
