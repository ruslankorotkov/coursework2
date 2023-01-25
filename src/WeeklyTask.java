import java.time.LocalDateTime;

public class WeeklyTask extends Task{


    public WeeklyTask( String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super( title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln() {
        System.out.println(" еженедельная ");
        return false;
    }
}
