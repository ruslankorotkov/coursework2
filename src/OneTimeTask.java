import java.time.LocalDateTime;

public class OneTimeTask extends Task{

    public OneTimeTask(String title, Type type, int id, LocalDateTime dateTime, String description) {
        super( title, type, id, dateTime, description);
    }

    @Override
    public boolean appearsln() {
        return false;
    }
}
