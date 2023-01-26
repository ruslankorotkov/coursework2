import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class WeeklyTask extends Task {


    public WeeklyTask(String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln() {
        if (LocalDate.now() == LocalDate.of(2023, 1, 26)) {
        }
        System.out.println(" Задача еженедельная ");
        return true;
    }
}
