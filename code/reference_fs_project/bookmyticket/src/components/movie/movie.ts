import { ChangeDetectionStrategy, ChangeDetectorRef, Component } from '@angular/core';
import { IMovie } from '../../interfaces/movie';
import { Moviservice} from '../../app/service/moviservice';
import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import {IOrder} from '../../interfaces/order';
import { Orderservice } from '../../app/service/orderservice';

@Component({
  selector: 'app-movie',
  imports: [FormsModule],
  templateUrl: './movie.html',
  styleUrl: './movie.css',

  changeDetection: ChangeDetectionStrategy.OnPush


})
export class Movie {


  movieList:IMovie[]=[];
  numberOfTicket:number=1;
  movieMap: Map<number, number> = new Map();
  constructor(private movieService:Moviservice,
    private cdr:ChangeDetectorRef,
    private router:Router,
    private orderService:Orderservice,

  ){}

  ngOnInit()
  {

    let tokendata:any=localStorage.getItem("token");

    // if(tokendata==null)
    // {
    //     this.router.navigate(["/login"])
    // }

    this.movieService.getAllMovies().subscribe((data)=>{


        //console.log(data);
        this.movieList=data;
        this.movieList.map((d)=>{

            this.movieMap.set(d.id!,0);
            console.log( this.movieMap.get(d.id!))
        })
        console.log(this.movieList);
         this.cdr.markForCheck();


    })
      // this.cdr.detectChanges()
  }

  // save(movieId:number)
  // {

  //      this.router.navigate(['/login'])
  // }
  async save(movieId:number){

let orderData:IOrder={
      movieId:movieId,
      numberOfTicket:this.numberOfTicket

    };


     let  order:IOrder={
        movieId:0,
        numberOfTicket:0
      };

     (await this.orderService.save(orderData)).subscribe((result: IOrder)=>{

           order=result;
           console.log("result="+result.id)

           this.router.navigate(['/payment/'+result.id+"/"+result.totalOrderPrice])
    })




  }

  changeTicketNumber(movieId:number){

    console.log("movieId="+movieId + "-" +this.numberOfTicket)
    this.movieMap.set(movieId,this.numberOfTicket);

    console.log("after numberOfTickets="+this.movieMap.get(movieId))
  }

}
