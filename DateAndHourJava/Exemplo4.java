package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exemplo4 {

	public static void main(String[] args) {
		LocalDate data04 = LocalDate.parse("2024-04-01");
		LocalDateTime data05 = LocalDateTime.parse("2024-04-01T01:20:21");
		Instant data06 = Instant.parse("2024-01-01T01:30:22Z");
		
		LocalDate pastWeekLocalDate = data04.minusDays(7);
		LocalDate nextWeekLocalDate = data04.plusDays(7);
		
		System.out.println("pastWeekLocalDate "+pastWeekLocalDate);
		System.out.println("nextWeekLocalDate "+nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = data05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = data05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime "+pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime "+nextWeekLocalDateTime);
		
		Instant pastWeekLocalInstant = data06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = data06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalInstant "+pastWeekLocalInstant);
		System.out.println("nextWeekLocalInstant "+nextWeekLocalInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), data04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, data05);
		Duration t3 = Duration.between(pastWeekLocalInstant, data06);
		
		System.out.println("t1 dias = "+ t1.toDays());
		System.out.println("t2 dias = "+ t2.toDays());
		System.out.println("t3 dias = "+ t3.toDays());
			

	}

}
