interface Movie {
    title: string;
    language:string;
    year: number;
    imdbRating: number;

}

let movieList:Movie[] = [{
    title: "Inception", 
    language: "English",
    year: 2010,
    imdbRating: 8.8
},{
    title: "Mask orf Zoro", 
    language: "English",
    year: 2010,
    imdbRating: 8.8
},{
    title: "Catch me if you can", 
    language: "English",
    year: 2010,
    imdbRating: 8.8
}];


function changeRating(movie:Movie[]):Movie {

    movie[0].title.toUpperCase();
    return movie[0];

}

 console.log(movieList[1].title)