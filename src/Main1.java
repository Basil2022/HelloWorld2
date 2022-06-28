import java.time.LocalDate;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main1 {
    public static void main(String[] args) {
        //adaugat azi, 28 iunie 2022

        System.out.println("Salutare lume -----> " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
