import {NgModule} from "@angular/core";
import {AddTodoComponent, TodoComponent, TodoItemComponent} from "./";
import {CommonModule} from "@angular/common";
import {FormsModule} from "@angular/forms";
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
    declarations: [AddTodoComponent, TodoComponent, TodoItemComponent],
    exports: [],
    imports: [CommonModule, FormsModule, ReactiveFormsModule]
})

export class ToDoModule {

}
