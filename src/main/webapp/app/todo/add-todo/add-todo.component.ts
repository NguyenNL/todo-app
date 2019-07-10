import {Component, EventEmitter, Input, OnInit, Output} from "@angular/core";
import {Form, FormBuilder, FormGroup, Validators} from "@angular/forms";
import * as moment from "moment";
import {Todo} from "../../_models";

@Component({
    selector: 'app-add-todo',
    templateUrl: './add-todo.component.html',
    styleUrls:['./add-todo.component.scss']
})

export class AddTodoComponent implements OnInit{
    addTodoForm: FormGroup;
    @Output() addTodoEvent: EventEmitter<any> = new EventEmitter();
    @Input() submitBtnName: string;
    @Input() todo: Todo;

    constructor(private builder: FormBuilder){

    }

    ngOnInit(): void {
        this.addTodoForm = this.builder.group({
            title: [this.todo ? this.todo.title: '', Validators.compose([Validators.required])],
            description: [this.todo ? this.todo.description : '', Validators.compose([Validators.required])],
            eventTime: [this.todo ? moment(this.todo.eventTime).format('YYYY-MM-DDTHH:MM'): '', Validators.compose([Validators.required])]

        }, {validator: this.checkTodoDate});


    }

    checkTodoDate(group: FormGroup){
        const {eventTime} = group.value;
        if (!moment(eventTime).isAfter(moment())) {
            group.controls.eventTime.setErrors({notGreaterCurrentTime: true})
        }

    }

    addTodo(){
        const {title, description, eventTime} = this.addTodoForm.value;
        this.addTodoEvent.emit({id: this.todo ? this.todo.id : null ,title, description, eventTime: moment(eventTime).toISOString()});
        this.addTodoForm.reset();
    }
}
