
import java.time.LocalDate;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World, my name is Vasile");
        System.out.println("Data de azi: 29.06.2022");
              System.out.println("Salutare lume -----> " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
	    //comentariu adaugat in repo central

    }
}
