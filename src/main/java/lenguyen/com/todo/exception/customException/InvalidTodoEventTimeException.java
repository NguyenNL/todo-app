package lenguyen.com.todo.exception.customException;

public class InvalidTodoEventTimeException extends RuntimeException {
    public InvalidTodoEventTimeException(String message) {
        super(message);
    }
}
