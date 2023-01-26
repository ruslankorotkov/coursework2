import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task extends TaskService {
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
        return Objects.hash(title, type, id, dateTime, description);
    }

    public Task(String title, Type type, int id, LocalDateTime dateTime, String description) throws IncorrectArgumentException {
        super();
        if (title == null || title.isEmpty() || title.isBlank()) {
            throw new IncorrectArgumentException(" Значение задачи введено не коректно.");
        } else {
            this.title = title;
        }
        if (description == null || description.isEmpty() || description.isBlank()) {
            this.description = " default ";
        } else {
            this.description = description;
        }
        this.type = type;
        this.id = id;
        this.dateTime = dateTime;
        idGenerator++;
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

    public String getDescription() {
        return description;
    }

    public abstract boolean appearsln();

    @Override
    public String toString() {
        return " Задачи: " +
                " id --> " + id +
                " Заголовок --> " + title +
                " тип --> " + type +
                " время --> " + dateTime +
                " описание --> " + description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
