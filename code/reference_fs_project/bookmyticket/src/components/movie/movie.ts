import { ChangeDetectorRef, Component } from '@angular/core';
import { IMovie } from '../../interfaces/movie';
import { Moviservice } from '../../service/moviservice';

@Component({
  selector: 'app-movie',
  imports: [],
  templateUrl: './movie.html',
  styleUrl: './movie.css'
})
export class Movie {

  movieList:IMovie[]=[];

  constructor(private movieService:Moviservice,private cdr:ChangeDetectorRef){}

  ngOnInit()
  {


    this.movieService.getAllMovies().subscribe((data)=>{


        //console.log(data);
        this.movieList=data;
        console.log(this.movieList);


    })
       this.cdr.detectChanges()
  }

}
