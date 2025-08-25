import { Routes } from '@angular/router';
import { Login } from '../login/login';
import { Movie } from '../movie/movie';

export const routes: Routes = [

  { path: '', component: Login },
  { path: 'movielist', component: Movie },

];
