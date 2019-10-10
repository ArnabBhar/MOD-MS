import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { Router } from "@angular/router";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private logIn: LoginService, public router: Router) { }

  ngOnInit() {
  }


  logOut() {
    this.router.navigate(['/']);
    this.logIn.loginName = 'guest';
  }
}
