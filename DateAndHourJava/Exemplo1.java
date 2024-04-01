package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo1 {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html //DOCUMENTAÇÃO
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		LocalDate data01 = LocalDate.now(); 
		LocalDateTime data02 = LocalDateTime.now();
		Instant data03 = Instant.now();
		
		LocalDate data04 = LocalDate.parse("2024-04-01");
		LocalDateTime data05 = LocalDateTime.parse("2024-04-01T01:20:21");
		Instant data06 = Instant.parse("2024-01-01T01:30:22Z");
		Instant data07 = Instant.parse("2024-01-01T01:30:22-03:00");
		
		LocalDate data08 = LocalDate.parse("20/11/2021", formatter1); //funcionará com o dateFormatter
		LocalDateTime data09 = LocalDateTime.parse("20/11/2022 01:30", formatter2); //funcionará com o dateFormatter
		
		LocalDate data10 = LocalDate.of(2022, 7, 20);
		LocalDateTime data11 = LocalDateTime.of(2024, 7, 2, 1, 30);
		
		//toString() passará para o padrão ISO 8601
		
		System.out.println("dt01 = "+data01.toString()); //data atual imprimiu dt01 = 2024-04-01
		System.out.println("dt02 = "+data02.toString()); //data+horario atual imprimiu dt02 = 2024-04-01T15:07:15.524147600
		System.out.println("dt03 = "+data03.toString()); //horario gmt 3 hrs de diferença - imprimiu dt03 = 2024-04-01T18:08:04.598003700Z
		System.out.println("dt04 = "+data04.toString()); //imprimiu dt04 = 2024-04-01
		System.out.println("dt05 = "+data05.toString()); //imprimiu dt05 = 2024-04-01T01:20:21
		System.out.println("dt06 = "+data06.toString()); //imprimiu dt06 = 2024-01-01T01:30:22Z
		System.out.println("dt07 = "+data07.toString()); //3 horas de diferença em relação ao anterior. Imprimiu dt07 = 2024-01-01T04:30:22Z
		System.out.println("dt08 = "+data08.toString()); //imprimiu dt08 = 2021-11-20
		System.out.println("dt09 = "+data09.toString()); //imprimiu dt09 = 2022-11-20T01:30
		System.out.println("dt10 = "+data10.toString()); //imprimiu dt10 = 2022-07-20
		System.out.println("dt11 = "+data11.toString()); //imprimiu dt11 = 2024-07-02T01:30
		
		
		
		
	}

}
