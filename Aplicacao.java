import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Mostrar a Diferenca de Dias, Meses e Anos entre a Data atual e o nascimento de James Gosling
		 * criador do Java
		 */
		String dataNascimento = "19/05/1955";
		
		LocalDate ldt1 = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate ldt2 = LocalDate.now();
		
		System.out.println("Dias: " + ChronoUnit.DAYS.between(ldt1, ldt2));
		System.out.println("Meses: " + ChronoUnit.MONTHS.between(ldt1, ldt2));
		System.out.println("Anos: " + ChronoUnit.YEARS.between(ldt1, ldt2));
		
		
		System.out.println("------------------");
		
		/**
		 * Mostrar o tempo que se passou desde às 3h da manhã do dia de hoje ate a hora atual em Segundos
		 */
		LocalTime lt1 = LocalTime.parse("03:00");
		LocalTime lt2 = LocalTime.now();
		Duration d = Duration.between(lt1, lt2);
		
		System.out.println("Segundos entre as 3 da manhã e agora: " + d.getSeconds());
	}

}
