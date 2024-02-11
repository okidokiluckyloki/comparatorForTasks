import java.util.Comparator;

public class CustomComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        if (o1.start != null) {
            return o1.start.compareTo(o2.start);
        } else {
            return 1;
        }
    }
}
