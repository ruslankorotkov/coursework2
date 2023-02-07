import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class TaskService {

    private Map<Integer, Task> taskMap = new HashMap<>();
    private List<Task> removedTasks = new LinkedList<>();

    public void add(Task task) {
        taskMap.put(task.getId(), task);
    }

    public Task remove(int id) throws TaskNotFoundException {
        if (!taskMap.containsKey(id)) {
            throw new TaskNotFoundException(" Ключа  <id> нет");
        }
        return taskMap.remove(id);
    }

    public List<Task> getAllByDate(LocalDate dateForChecking) {
        List<Task> taskListAllByDate = new LinkedList<>();
        for (Map.Entry<Integer, Task> entry : taskMap.entrySet()) {
            if (entry.getValue().appearsln(dateForChecking)) {
                taskListAllByDate.add(entry.getValue());
            }
        }
        return taskListAllByDate;
    }

    @Override
    public String toString() {
        return " TaskService " +
                " Мапа задач" + taskMap +
                ", removedTasks=" + removedTasks;

    }
}
