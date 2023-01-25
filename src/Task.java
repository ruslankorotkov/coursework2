import java.time.LocalDateTime;
import java.util.Objects;

public class Task extends TaskService{
    public enum Type{
        WORK(" рабочие задачи "),
        PERSONAL(" личные задачи ");
        private final String type;
        Type(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }
        @Override
        public String toString() {
            return  type ;
        }
    }
    private int idGenerator;
    private String title;
    private Type type;
    private int id;
    private LocalDateTime dateTime;
    private String description;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && title.equals(task.title) && type == task.type && dateTime.equals(task.dateTime) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenerator, title, type, id, dateTime, description);
    }

    public Task( String title, Type type, int id, LocalDateTime dateTime, String description) {
        super();
        idGenerator ++;
        this.title = title;
        this.type = type;
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return " Задача: " +
                ", id: " + id +
                ", тип: " + type +
                ", загаловок: " + title +
                ", время: " + dateTime +
                ", описание: " + description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
