import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
  username = '';
  password = '';
  rememberMe = false;

  constructor() { }

  ngOnInit(): void {
  }

  login(): void {
    alert('username: ' + this.username + ' - password: ' + this.password);
  }

}
