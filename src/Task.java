import java.time.LocalDateTime;
public class Task {
    public String name;
    public LocalDateTime start;

    public Task(String name, LocalDateTime start) {
        this.name = name;
        this.start = start;
    }
}
