package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exemplo3 {

	public static void main(String[] args) {
		LocalDate data04 = LocalDate.parse("2024-04-01");
		LocalDateTime data05 = LocalDateTime.parse("2024-04-01T01:20:21");
		Instant data06 = Instant.parse("2024-01-01T01:30:22Z");
		
		LocalDate resultado1 = LocalDate.ofInstant(data06, ZoneId.systemDefault());
		LocalDate resultado2 = LocalDate.ofInstant(data06, ZoneId.of("Portugal"));
		LocalDateTime resultado3 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
		LocalDateTime resultado4 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));
		
		System.out.println("r1: "+resultado1); //r1: 2023-12-31
		System.out.println("r2: "+resultado2); //r2: 2024-01-01 fuso horario diferente
		System.out.println("r3: "+resultado3); //r3: 2023-12-31T22:30:22
		System.out.println("r4: "+resultado4); //r4: 2024-01-01T01:30:22
		
		System.out.println("data04 dia = "+data04.getDayOfMonth());
		System.out.println("data04 mes = "+data04.getMonthValue());
		System.out.println("data04 ano = "+data04.getYear());
		
		System.out.println("data05 hora = "+data05.getHour());
		System.out.println("data05 hora = "+data05.getMinute());
		
		
		
		
	}

}
