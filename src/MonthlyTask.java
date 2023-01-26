import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

public class MonthlyTask extends Task {

    public MonthlyTask(String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super(title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln() {
        if (LocalDate.now().getMonth() == Month.of(1)) {
            System.out.println(" Задача ежемесячная ");
        }
        return true;
    }
}
