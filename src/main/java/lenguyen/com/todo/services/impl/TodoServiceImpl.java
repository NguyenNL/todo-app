package lenguyen.com.todo.services.impl;

import lenguyen.com.todo.config.Constants;
import lenguyen.com.todo.dto.SuccessDto;
import lenguyen.com.todo.dto.TodoDto;
import lenguyen.com.todo.exception.customException.InvalidTodoEventTimeException;
import lenguyen.com.todo.mapper.TodoMapper;
import lenguyen.com.todo.model.Todo;
import lenguyen.com.todo.repository.TodoRepository;
import lenguyen.com.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoMapper todoMapper;


    @Override
    public TodoDto saveTodo(TodoDto todoDto) {
        Todo savedTodo;
        Todo saveTodo;

        this.validateTodo(todoDto);

        if (todoDto.getId() != null){
            Optional<Todo> existToDoOptional = todoRepository.findById(todoDto.getId());
            if (existToDoOptional.isPresent()){
                saveTodo = existToDoOptional.get();
                saveTodo.setDescription(todoDto.getDescription());
                saveTodo.setTitle(todoDto.getTitle());
                saveTodo.setEventTime(todoDto.getEventTime());
            } else {
                saveTodo = todoMapper.convertTodoDtoToTodo(todoDto);
            }
        } else {
            saveTodo = todoMapper.convertTodoDtoToTodo(todoDto);
        }


        savedTodo = todoRepository.save(saveTodo);


        return todoMapper.convertTodoToTodoDto(savedTodo);

    }

    @Override
    public SuccessDto deleteTodoById(Long id) {
        todoRepository.deleteById(id);
        return new SuccessDto(Constants.SUCCESS);
    }

    @Override
    public List<TodoDto> findAllTodo() {
        List<Todo> todos = todoRepository.findAll();
        return todoMapper.convertTodosToTodoDtos(todos);
    }

    private void validateTodo(TodoDto todoDto){
        if (!todoDto.getEventTime().isAfter(Instant.now())){
            throw new  InvalidTodoEventTimeException(Constants.MESSAGE_INVALID_EVENT_TIME);
        }
    }
}
