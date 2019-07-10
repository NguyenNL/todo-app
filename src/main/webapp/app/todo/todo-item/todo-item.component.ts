import {Component, EventEmitter, Input, Output} from "@angular/core";
import {Todo} from "../../_models";
import * as moment from 'moment';

@Component({
    selector: 'app-todo-item',
    templateUrl: './todo-item.component.html',
    styleUrls: ['./todo-item.component.scss']
})

export class TodoItemComponent {

    isEdit: boolean;
    isChecked: boolean;

    @Output()
    editEvent: EventEmitter<any> = new EventEmitter();

    @Output()
    deleteEvent: EventEmitter<any> = new EventEmitter();

    @Output()
    checkedEvent: EventEmitter<any> = new EventEmitter();

    constructor() {
    }


    @Input()
    todo: Todo;

    setClasses(){

    }

    onCheckToggle(event: any, todo: Todo) {
        this.checkedEvent.emit({event, todo})
    }

    onDelete(todo: Todo) {
        this.deleteEvent.emit(todo);
    }

    edit(todo: Todo){
        this.isEdit = !this.isEdit;
    }

    parseEventTimeTodo(eventTime: string){
        return moment(eventTime).format('YYYY-MM-DD HH:MM A');
    }

    editTodo(todo: Todo){
        this.isEdit = false;
        this.editEvent.emit(todo);
    }

    
}
