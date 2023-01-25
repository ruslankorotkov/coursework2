import java.time.LocalDateTime;

public class OneTimeTask extends Task{


    public OneTimeTask( String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super( title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln() {
        System.out.println(" однократная ");
        return false;
    }
}
