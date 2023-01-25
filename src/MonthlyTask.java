import java.time.LocalDateTime;

public class MonthlyTask extends Task {
    private boolean appearsln;

    public boolean isAppearsln() {
        return appearsln;
    }

    public void setAppearsln(boolean appearsln) {
        this.appearsln = appearsln;
    }

    @Override
    public String toString() {
        return "MonthlyTask{" +
                "appearsln=" + appearsln +
                '}';
    }

    public MonthlyTask(String title, Type type, int id, LocalDateTime dateTime, String description, boolean appearsln) {
        super( title, type, id, dateTime, description);
        this.appearsln = appearsln;
    }
}
