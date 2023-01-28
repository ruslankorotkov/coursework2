import java.time.LocalDate;
import java.util.*;

public class TaskService {

    private Map<Integer, Task> taskMap;
    private List<Task> removedTasks = new LinkedList<>();

    public void add(Task task) {
        taskMap.put(task.getId(), task);
    }

    public Task remove(int id) throws TaskNotFoundException {
        if (!taskMap.containsKey(id) || taskMap.get(id) == null) {
            throw new TaskNotFoundException();
        }
        taskMap.remove(id);
        return null;
    }
    public List<Task> getAllByDate(LocalDate localDates) {
        List<Task> taskList = new LinkedList<>();
        for (Map.Entry<Integer,Task>entry : taskMap.entrySet()) {
            if(entry.getValue() != null ){
                taskList.add(entry.getValue());
            }
        }
        return taskList;
    }
    @Override
    public String toString() {
        return "TaskService{" +
                "taskMap=" + taskMap +
                ", removedTasks=" + removedTasks +
                '}';
    }
}
