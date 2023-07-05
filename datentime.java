import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datentime {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        LocalTime obj = LocalTime.now();
        System.out.println(myObj);
        System.out.println(obj);
        System.out.println("Date and time after formatting");
        DateTimeFormatter obj1 = new DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(obj);
    }
}
