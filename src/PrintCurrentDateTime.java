import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class PrintCurrentDateTime {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd, yyyy \nhh:mm aa");
        System.out.println("Current Date and Time :");
        System.out.println(simpleDateFormat.format(date));
        System.out.println();

    }
}
