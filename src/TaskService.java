import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TaskService <A extends Task>{
    @Override
    public String toString() {
        return "TaskService{" +
                "taskMap=" + taskMap +
                ", removedTasks=" + removedTasks +
                '}';
    }

    public Collection<Task> getRemovedTasks() {
        return removedTasks;
    }

    public void setRemovedTasks(Collection<Task> removedTasks) {
        this.removedTasks = removedTasks;
    }

    public Map<Integer, Set<Task>> getTaskMap() {
        return taskMap;
    }

    public void setTaskMap(Map<Integer, Set<Task>> taskMap) {
        this.taskMap = taskMap;
    }

    public TaskService() {
        this.taskMap = taskMap;
    }

    private Map<Integer, Set<Task>>taskMap;
    Collection<Task>removedTasks;
}
