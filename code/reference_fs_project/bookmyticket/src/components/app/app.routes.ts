import { RouterModule, Routes } from '@angular/router';
import { Login } from '../login/login';
import { Movie } from '../movie/movie';
import { Payment } from '../payment/payment';

export const routes: Routes = [

  { path: '', component: Login },
  { path: 'payment/:movieId', component: Payment },
  { path: 'movielist', component: Movie },

];
 RouterModule.forRoot(routes, { enableTracing: true })
