import java.time.LocalDate;
import java.time.LocalDateTime;


public class YearlyTask extends Task {
    public YearlyTask(String title, Type type, LocalDateTime dateTime, String description) {
        super(title, type, dateTime, description);
    }

    @Override
    public boolean appearsln(LocalDate dateForChecking) {
        if (LocalDate.now() == LocalDate.of(2023, 1, 26)) {
        }
        System.out.println(" Задача  ежегодная");
        return (dateForChecking.isAfter(getDateTime().toLocalDate()) || dateForChecking.isEqual(getDateTime().toLocalDate()) && dateForChecking.getDayOfYear() == getDateTime().getDayOfYear());
    }

    @Override
    public String toString() {
        return "YearlyTask " + super.toString();
    }
}
