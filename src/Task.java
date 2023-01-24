import java.time.LocalDateTime;

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
            return "Type{" +
                    "type='" + type + '\'' +
                    '}';
        }
    }
    private int idGenerator;
    private String title;
    private Type type;
    private int id;
    private LocalDateTime dateTime;
    private String description;

    public Task(int idGenerator, String title, Type type, int id, LocalDateTime dateTime, String description) {
        super();
        this.idGenerator = idGenerator;
        this.title = title;
        this.type = type;
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
    }
    public int getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(int idGenerator) {
        this.idGenerator = idGenerator;
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

    public void setType(Type type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setDescription(String description) {
        this.description = description;
    }


}
