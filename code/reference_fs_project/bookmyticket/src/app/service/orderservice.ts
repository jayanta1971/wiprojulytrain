import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { IOrder } from '../../interfaces/order';
import { Observable } from 'rxjs';
import { BASE_URL } from './util/appmstant';

@Injectable({
  providedIn: 'root'
})
export class Orderservice {





  constructor (private http:HttpClient){}

  save(order:IOrder):Observable<IOrder>
  {
      console.log("--save--")

    let  token=localStorage.getItem("token");
    // console.log("jwt token="+token)
     let header:HttpHeaders  = new HttpHeaders()

       const headers = new HttpHeaders()
      .set('Content-Type', 'application/json')
      .set('Authorization', `${token}`)
      let url:string= BASE_URL+ "/order";
      return this.http.post<IOrder>(url,order,{headers})





  }

}
