package lenguyen.com.todo.mapper.impl;

import lenguyen.com.todo.dto.TodoDto;
import lenguyen.com.todo.mapper.TodoMapper;
import lenguyen.com.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class TodoMapperImpl implements TodoMapper {
    @Override
    public Todo convertTodoDtoToTodo(TodoDto todoDto) {
        return new Todo(todoDto.getTitle(), todoDto.getDescription(), todoDto.getEventTime());
    }

    @Override
    public TodoDto convertTodoToTodoDto(Todo todo) {
        return new TodoDto(todo.getId(), todo.getTitle(), todo.getDescription(), todo.getEventTime());
    }

    @Override
    public List<TodoDto> convertTodosToTodoDtos(List<Todo> todos) {
        return todos.stream()
                .filter(Objects::nonNull)
                .map(this::convertTodoToTodoDto)
                .collect(Collectors.toList());
    }
}
