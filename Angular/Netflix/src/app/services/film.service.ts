import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { tap, catchError } from 'rxjs/operators';



@Injectable({
  providedIn: 'root'
})
export class FilmService {

  allFilms: any = [];

  filmsUrl = 'https://netflix.cristiancarrino.com/film/read.php';

  constructor(
    private http: HttpClient,
    ) { }

  getFilms(): Observable<any> {
    return this.http.get(this.filmsUrl).pipe(tap(result => {
        this.allFilms = result
    }),
      catchError(error =>{
        this.allFilms = [];
        return of([]);
      } )
    )

    }
  }

