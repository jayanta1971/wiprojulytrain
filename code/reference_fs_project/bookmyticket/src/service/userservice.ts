import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../interfaces/user';
import { BASE_URL } from '../app/service/util/appmstant';
import { Token } from '@angular/compiler';
import { TokenData } from '../interfaces/token';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http:HttpClient){}

  login(user:User):Observable<TokenData>{


    let url:string= BASE_URL+ "/user/login";
    console.log("url-"+url)
    return this.http.post<any>(url,user);

  }

}
