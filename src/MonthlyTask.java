import java.time.LocalDateTime;

public class MonthlyTask extends Task {

    public MonthlyTask( String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super( title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln() {
        System.out.println(" ежемесячная ");
        return false;
    }
}
