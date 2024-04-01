package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Exemplo2 {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html //DOCUMENTAÇÃO
		
		LocalDate data04 = LocalDate.parse("2024-04-01");
		LocalDateTime data05 = LocalDateTime.parse("2024-04-01T01:20:21");
		Instant data06 = Instant.parse("2024-01-01T01:30:22Z");
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm ").withZone(ZoneId.systemDefault());
		DateTimeFormatter formatter4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formatter5 = DateTimeFormatter.ISO_INSTANT;
		
		
		System.out.println("d04 = "+data04.format(formatter1));
		System.out.println("d04 = "+formatter1.format(data04));
		
		System.out.println("d05 = "+data05.format(formatter1));
		System.out.println("d05 = "+data05.format(formatter2));
		System.out.println("d05 = "+data05.format(formatter4));
		
		System.out.println("d06 = "+data06.toString());
		System.out.println("d06 = "+formatter3.format(data06));
		System.out.println("d06 = "+formatter5.format(data06));
		
		
		
		
		
		
	}

}
