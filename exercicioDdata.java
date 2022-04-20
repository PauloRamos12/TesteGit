package primeiroProjeto;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class exercicioDdata {

public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt","BR"));

		Calendar hoje = Calendar.getInstance();
			
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int mes = hoje.get(Calendar.MONTH);
		int ano = hoje.get(Calendar.YEAR);
		
		mes ++; // o m�s come�a em 0 - janeiro		
		
		String data = dia + "/" + mes + "/" + ano;
		System.out.println("A data de hoje �: " + data);

		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		
		String agora = hora + ":" + minutos;
		System.out.println("Agora: " + agora);
		// ou ent�o
		System.out.printf("Hoje � dia %d/%d/%d, s�o %d horas e %d minutos", dia, mes, ano, hora, minutos );


	}
}
