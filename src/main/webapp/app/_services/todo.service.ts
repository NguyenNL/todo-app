import {Injectable} from "@angular/core";
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Todo} from "../_models";

@Injectable({
    providedIn: 'root'
})
export class TodoService {
    constructor(private http: HttpClient){

    }

    getTodos():Observable<Todo[]> {
        return this.http.get<Todo[]>('/api/getAll');
    }


    addTodo(todo:Todo):Observable<Todo> {
        return this.http.post<Todo>('/api/saveTodo', todo);
    }

    deleteTodo(id: number):Observable<any> {
        return this.http.delete<any>('/api/deleteTodo', {params:{id: `${id}`}});
    }
}
