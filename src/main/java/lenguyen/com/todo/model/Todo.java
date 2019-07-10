package lenguyen.com.todo.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 50)
    private String title;


    @Column(name = "description")
    private String description;

    @Column(name = "event_time")
    private Instant eventTime;

    public Todo() {
    }

    public Todo(String title, String description, Instant eventTime) {
        this.title = title;
        this.description = description;
        this.eventTime = eventTime;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getEventTime() {
        return eventTime;
    }

    public void setEventTime(Instant eventTime) {
        this.eventTime = eventTime;
    }


}
