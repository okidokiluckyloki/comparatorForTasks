import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Task> prioritizedTasks = new TreeSet<>(new CustomComparator());

        Task task1 = new Task("t1", LocalDateTime.of(2024, 2, 11, 19, 0));
        Task task2 = new Task("t2", LocalDateTime.of(2024, 2, 11, 20, 0));
        Task task3 = new Task("t3", null);
        Task task4 = new Task("t4", null);
        Task task5 = new Task("t5", LocalDateTime.of(2024, 2, 11, 15, 0));

        prioritizedTasks.add(task1);
        prioritizedTasks.add(task2);
        prioritizedTasks.add(task3);
        prioritizedTasks.add(task4);
        prioritizedTasks.add(task5);

        for (Task prioritizedTask : prioritizedTasks) {
            System.out.println(prioritizedTask.name + " " + prioritizedTask.start);
        }
    }
}
