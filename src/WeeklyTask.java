import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

public class WeeklyTask extends Task {
    public WeeklyTask(String title, Type type, LocalDateTime dateTime, String description) {
        super(title, type, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate dateForChecking) {
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) || dateForChecking.isEqual(getDateTime().toLocalDate()) && dateForChecking.getDayOfWeek() == getDateTime().getDayOfWeek());
    }

    @Override
    public String toString() {
        return "WeeklyTask " + super.toString();
    }

}
