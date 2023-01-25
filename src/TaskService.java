import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class TaskService<A extends Task> {

    public Collection<Task> getAllByDate() {
        return null;
    }


    public TaskService() {
        this.taskMap = taskMap;
    }


    public void add(Task... task) {
    }

    public Task remove(int id) {
        return null;
    }

    private Map<Integer, Set<Task>> taskMap;
    private Collection<Task> removedTasks;
}
