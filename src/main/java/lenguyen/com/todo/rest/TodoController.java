package lenguyen.com.todo.rest;

import lenguyen.com.todo.dto.SuccessDto;
import lenguyen.com.todo.dto.TodoDto;
import lenguyen.com.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @PostMapping("/saveTodo")
    public TodoDto saveTodo(@RequestBody TodoDto  todoDto){
        return todoService.saveTodo(todoDto);
    }

    @DeleteMapping("/deleteTodo")
    public SuccessDto deleteTodo(@RequestParam Long id){
        return todoService.deleteTodoById(id);
    }


    @GetMapping("/getAll")
    public List<TodoDto> findAllTodo(){
        return this.todoService.findAllTodo();
    }
}
