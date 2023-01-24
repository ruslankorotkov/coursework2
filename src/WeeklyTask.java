import java.time.LocalDateTime;

public class WeeklyTask extends Task{
    public boolean isAppearsln() {
        return appearsln;
    }

    public void setAppearsln(boolean appearsln) {
        this.appearsln = appearsln;
    }

    @Override
    public String toString() {
        return "WeeklyTask{" +
                "appearsln=" + appearsln +
                '}';
    }

    public WeeklyTask(int idGenerator, String title, Type type, int id, LocalDateTime dateTime, String description, boolean appearsln) {
        super(idGenerator, title, type, id, dateTime, description);
        this.appearsln = appearsln;
    }

    private boolean appearsln;

}
