import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IMovie } from '../../interfaces/movie';
import { BASE_URL } from './util/appmstant';

@Injectable({
  providedIn: 'root'
})
export class Moviservice {


    constructor(private  http:HttpClient){}

    getAllMovies():Observable<IMovie[]>
    {
     let  token=localStorage.getItem("token");
    // console.log("jwt token="+token)
     let header:HttpHeaders  = new HttpHeaders()

       const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `${token}`)

      let url:string= BASE_URL+"/movie"
      return this.http.get<IMovie[]>(url,{headers});

    }


}
