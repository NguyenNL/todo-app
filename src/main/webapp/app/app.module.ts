import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule }    from '@angular/forms';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';


import { AppComponent }  from './app.component';
import { routing }        from './app.routing';
import { NavComponent } from "./_components";
import {ToDoModule} from "./todo/to-do.module";


@NgModule({
    imports: [
        BrowserModule,
        ReactiveFormsModule,
        HttpClientModule,
        routing,
        ToDoModule
    ],
    declarations: [
        AppComponent,
        NavComponent
    ],
    providers: [
    ],
    bootstrap: [AppComponent]
})
 export class AppModule {
    
}
