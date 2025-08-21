import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IUser } from './iuser';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient) { }


  getUsers():Observable<IUser[]> {
    return this.http.get<IUser[]>('http://localhost:3000/user');
  }


}
