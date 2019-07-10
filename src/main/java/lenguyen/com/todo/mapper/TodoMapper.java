package lenguyen.com.todo.mapper;

import lenguyen.com.todo.dto.TodoDto;
import lenguyen.com.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TodoMapper {
    Todo convertTodoDtoToTodo(TodoDto todoDto);
    TodoDto convertTodoToTodoDto(Todo todo);
    List<TodoDto> convertTodosToTodoDtos(List<Todo> todos);
}
