import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { tap, catchError } from 'rxjs/operators';
import { LocalStorageService } from 'ngx-localstorage';

@Injectable({
  providedIn: 'root'
})


export class UserService {

  loggedUser: any = null;

  loginUrl = 'https://netflix.cristiancarrino.com/user/login.php';

  httpOptions = {
    headers: new HttpHeaders({'Content-Type': 'application/json'})
  }


  constructor(
    private http: HttpClient,
    private localStorage: LocalStorageService,
    ) { }

  login(username: string, password:string, rememberMe: boolean): Observable<any> {
    return this.http.post(
      this.loginUrl,
      {username: username, password: password},
      this.httpOptions
    ).pipe(tap(response => {
      console.log('login:', response);
        this.loggedUser = response

        if (rememberMe) {
          this.localStorage.set('loggedUser', response);
        }
    }),
    catchError(error => {
      console.log(error);
      this.logout();
      return of(null);
    })
    );
  }


  getLoggedUser(): any {
    this.loggedUser = this.localStorage.get('loggedUser');
    return this.loggedUser;
  }

  logout(){
    this.localStorage.remove('loggedUser');
    this.loggedUser = null;
  }


}
