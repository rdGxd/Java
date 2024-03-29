import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
  public static void main(String[] args) throws Exception {
    // DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now();
    Instant d03 = Instant.now();

    LocalDate d04 = LocalDate.parse("2022-07-20");
    LocalDateTime d05 = LocalDateTime.parse("2022-07-20T13:04:25");
    Instant d06 = Instant.parse("2024-07-20T13:04:25Z");
    Instant d07 = Instant.parse("2024-07-20T13:04:25-03:00");

    LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

    LocalDate d10 = LocalDate.of(2022, 7, 20);
    LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30, 0);

    // Convertendo uma data global para uma data local
    LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
    LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
    LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
    LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

    // Calculo com data-hora
    LocalDate pastWeekLocalDate = d04.minusDays(7);
    LocalDate nextWeekLocalDate = d04.plusDays(7);

    LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
    LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

    Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
    Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

    System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
    System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
    System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
    System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
    System.out.println("pastWeekInstant = " + pastWeekInstant);
    System.out.println("nextWeekInstant = " + nextWeekInstant);

    System.out.println("D01 = " + d01);
    System.out.println("D02 = " + d02);
    System.out.println("D03 = " + d03);
    System.out.println("D04 = " + d04);
    System.out.println("D05 = " + d05);
    System.out.println("D06 = " + d06);
    System.out.println("D07 = " + d07);
    System.out.println("D08 = " + d08);
    System.out.println("D09 = " + d09);
    System.out.println("D10 = " + d10);
    System.out.println("D11 = " + d11);
    System.out.println("D12 = " + d04.format(fmt3));
    System.out.println("D13 = " + fmt3.format(d04));
    System.out.println("D14 = " + fmt4.format(d05));
    System.out.println("D14 = " + fmt5.format(d06));
    System.out.println("D15 = " + fmt5.format(d06));

    System.out.println("R1 = " + r1);
    System.out.println("R2 = " + r2);
    System.out.println("R3 = " + r3);
    System.out.println("R4 = " + r4);

    System.out.println("D04 DIA = " + d04.getDayOfMonth());
    System.out.println("D04 MES = " + d04.getMonthValue());
    System.out.println("D04 ANO = " + d04.getYear());
    System.out.println("D05 HORA = " + d05.getHour());
    System.out.println("D05 MINUTE = " + d05.getMinute());

    // Calculando duração entre duas data-hora
    Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
    Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
    Duration t3 = Duration.between(pastWeekInstant, d06);
    Duration t4 = Duration.between(d06, pastWeekInstant);

    System.out.println("DURATION T1 = " + t1.toDays());
    System.out.println("DURATION T2 = " + t2.toDays());
    System.out.println("DURATION T3 = " + t3.toDays());
    System.out.println("DURATION T4 = " + t4.toDays());
  }
}
