package lenguyen.com.todo.services;

import lenguyen.com.todo.dto.SuccessDto;
import lenguyen.com.todo.dto.TodoDto;

import java.util.List;

public interface TodoService {
    TodoDto saveTodo(TodoDto todoDto);
    SuccessDto deleteTodoById(Long id);
    List<TodoDto> findAllTodo();
}
