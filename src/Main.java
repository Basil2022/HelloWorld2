
import java.time.LocalDate;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World, my name is Vasile");
        System.out.println("Hello World 2");
	     System.out.println("Hello World 3");
	     System.out.println("Hello World 4 ");
	     System.out.println("Hello World 5 ");
	     System.out.println("Hello World azi 28 iunie ");
	    System.out.println("Rand adaugat din repo central azi, -----------> " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
		    

    }
}
