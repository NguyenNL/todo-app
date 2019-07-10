package lenguyen.com.todo.dto;

import java.time.Instant;

public class TodoDto {
    private Long id;
    private String title;
    private String description;
    private Instant eventTime;

    public TodoDto() {
    }

    public TodoDto(Long id, String title, String description, Instant eventTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.eventTime = eventTime;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
