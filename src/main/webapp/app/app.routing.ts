import { Routes, RouterModule } from '@angular/router';
import {TodoComponent} from "./todo";


const appRoutes: Routes = [
    // otherwise redirect to home
    { path: '', component: TodoComponent },
    { path: '**', redirectTo: '' },
];

export const routing = RouterModule.forRoot(appRoutes);
