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

    getUsersById(userId:string):Observable<IUser> {
    return this.http.get<IUser>('http://localhost:3000/user/' + userId);
  }

  updateUser(user: IUser): Observable<IUser> {
    return this.http.put<IUser>(`http://localhost:3000/user/${user.id}`, user);
  }

  deleteUser(userId: string): Observable<void> {
    return this.http.delete<void>(`http://localhost:3000/user/${userId}`);
  }

  saveUser(user: IUser): Observable<IUser> {
    return this.http.post<IUser>('http://localhost:3000/user', user);
  }

}
