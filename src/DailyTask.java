import java.time.LocalDate;
import java.time.LocalDateTime;

public class DailyTask extends Task {
    public DailyTask(String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln() {
        if (LocalDate.now() == LocalDate.of(2023, 1, 26)) {
        }
        System.out.println(" Задача ежедневная ");
        return true;
    }
}
