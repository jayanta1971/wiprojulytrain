import { ChangeDetectionStrategy, ChangeDetectorRef, Component } from '@angular/core';
import { IMovie } from '../../interfaces/movie';
import { Moviservice} from '../../service/moviservice';
import { Router } from '@angular/router';

@Component({
  selector: 'app-movie',
  imports: [],
  templateUrl: './movie.html',
  styleUrl: './movie.css',
  changeDetection: ChangeDetectionStrategy.OnPush


})
export class Movie {

  movieList:IMovie[]=[];

  constructor(private movieService:Moviservice,private cdr:ChangeDetectorRef,private router:Router){}

  ngOnInit()
  {

    let tokendata:any=localStorage.getItem("token");
    if(tokendata==null)
    {
        this.router.navigate(["/login"])
    }

    this.movieService.getAllMovies().subscribe((data)=>{


        //console.log(data);
        this.movieList=data;
        console.log(this.movieList);
         this.cdr.markForCheck();


    })
      // this.cdr.detectChanges()
  }

}
