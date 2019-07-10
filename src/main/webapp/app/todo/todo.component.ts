import {Component, OnInit} from "@angular/core";
import {Todo} from "../_models";
import {TodoService} from "../_services";


@Component({
    selector: 'app-todo',
    templateUrl: './todo.component.html',
    styleUrls: ['todo.component.scss']
})
export class TodoComponent implements OnInit{
    todos: Todo [] = [];
    deleteTodos: Todo [] = [];

    constructor(private todoService: TodoService){
    }

    ngOnInit(): void {
        this.todoService.getTodos().subscribe((todos) => {
            this.todos = todos;
        });
    }

    addTodo(todo: Todo){
        this.todoService.addTodo(todo).subscribe((savedTodo: Todo) => {
            this.todos.push(savedTodo);
        });
    }

    editTodo(todo: Todo){
        this.todoService.addTodo(todo).subscribe((savedTodo: Todo) => {
            const index: number = this.todos.findIndex((element: Todo) => {
                return element.id === todo.id;
            });
            this.todos[index] = savedTodo;
        });
    }

    deleteTodo(todo: Todo){
        this.todoService.deleteTodo(todo.id).subscribe(() => {
            this.removeTodoElement(this.todos, todo);
        })
    }

    checkedTodo(data: any){
        const {todo, event} = data;
        event === 'Checked' ? this.deleteTodos.push(todo): this.removeTodoElement(this.deleteTodos, todo);
    }

    removeTodoElement(array: Todo [] , element: Todo){
        const index: number = array.findIndex((e: Todo) => {
            return e.id === element.id;
        });
        if (index > -1){
            array.splice(index, 1);
        }
        return array;
    }

    deleteMultiTodo(){
        this.deleteTodos.forEach((deleteTodo: Todo) => {
            this.deleteTodo(deleteTodo);
        });

        this.deleteTodos = [];
    }
}
