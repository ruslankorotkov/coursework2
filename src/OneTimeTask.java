import java.time.LocalDateTime;

public class OneTimeTask extends Task{
    public boolean isAppearsln() {
        return appearsln;
    }

    public void setAppearsln(boolean appearsln) {
        this.appearsln = appearsln;
    }

    @Override
    public String toString() {
        return "OneTimeTask{" +
                "appearsln=" + appearsln +
                '}';
    }

    public OneTimeTask(int idGenerator, String title, Type type, int id, LocalDateTime dateTime, String description, boolean appearsln) {
        super(idGenerator, title, type, id, dateTime, description);
        this.appearsln = appearsln;
    }

    private boolean appearsln;


}
