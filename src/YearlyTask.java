import java.time.LocalDateTime;

public class YearlyTask extends Task {


    public YearlyTask( String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super( title, type, id, dateTime, description);
    }


    @Override
    public boolean appearsln() {
        System.out.println(" ежегодная ");
        return false;
    }
}
