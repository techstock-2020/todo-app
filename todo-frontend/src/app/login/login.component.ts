import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router) { }

  hide = true;
  username: string | undefined;
  password: string | undefined;
  loggedIn: boolean = false;
  

  ngOnInit() {


  }
  login() : void {
     //bussiness logic goes here
    if(this.username == 'admin' && this.password == 'admin'){
     this.router.navigate(["user"]);
     this.loggedIn = true;
     alert("login sucessful");
    }else {
      alert("Invalid credentials");
    }
  }

}
