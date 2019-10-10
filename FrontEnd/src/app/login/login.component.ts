import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { LoginService } from '../login.service';
import { HttpClient } from '@angular/common/http';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { User } from 'src/app/user';
import { Actor } from 'src/app/actor';
import { Mentor } from 'src/app/mentor';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginDetails = new FormGroup({
    username: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    accountType: new FormControl('', Validators.required),
  });

  userData;
  selectedUser: string;
  isFailed = false;
  message: String;
  userdata;
  trainerData;
  actor: Actor;
  user: User;
  trainer: Mentor;
  constructor(public router: Router,
    private logIn: LoginService,
    private http: HttpClient) {
    this.logIn.loginName = "guest";
  }

  ngOnInit() {

  }
  selectUser(event) {
    this.selectedUser = event.target.value;
  }


  login() {
    this.logIn.getActorCred(this.loginDetails.get('username').value, this.loginDetails.get('accountType').value).subscribe(data => {
      this.actor = data;
      if (this.actor == null || this.actor.actorStatus == false) {
        if (this.actor == null) {
          this.message = 'Invalid login Credentials';
        } else {
          this.message = 'Account is blocked';
        }
        this.isFailed = true;
      } else {
        if (this.selectedUser === 'Trainee') {
          if (this.loginDetails.get('username').value == this.actor.actorEmail && this.loginDetails.get('password').value == this.actor.actorPassword) {
            this.logIn.getUserCred(this.actor.actorEmail).subscribe(data => {
              this.user = data;
            })
            this.logIn.loginName = 'loggedIn';
            this.router.navigate(['/trainee']);
            return true;
          }
          // this.http.get('/assets/users.json').subscribe(userdata => {
          //   this.userData = userdata;
          //   for (let i = 0; i < 1; i++) {
          //     if (this.userData[i].username == this.loginDetails.get('username').value && this.userData[i].password == this.loginDetails.get('password').value) {
          //       this.logIn.loginName = 'loggedIn';
          //       this.router.navigate(['/trainee']);
          //       return true;
          //     }
          //   }
          //   alert("wrong credentials");
          // });
        } else if (this.actor.actorType == 'Trainer') {
          if (this.loginDetails.get('username').value == this.actor.actorEmail && this.loginDetails.get('password').value == this.actor.actorPassword) {
            this.logIn.getMentorCred(this.actor.actorEmail).subscribe(data => {
              this.trainer = data;
            })
            this.logIn.loginName = 'loggedIn';
            this.router.navigate(['/mentor']);
            return true;
          }
        }
        // if (this.selectedUser === 'Trainer') {
        //   this.http.get('/assets/mentor.json').subscribe(userdata => {
        //     this.userData = userdata;
        //     for (let i = 0; i < 1; i++) {
        //       if (this.userData[i].username == this.loginDetails.get('username').value && this.userData[i].password == this.loginDetails.get('password').value) {

        //         this.logIn.loginName = 'loggedIn';
        //         this.router.navigate(['/mentor']);
        //         return true;
        //       }
        //     }
        //     alert("wrong credentials");
        //   });
        // }
      }
    })

    if (this.selectedUser === 'Admin') {
      this.http.get('/assets/admin.json').subscribe(userdata => {
        this.userData = userdata;
        for (let i = 0; i < 1; i++) {
          if (this.userData[i].username == this.loginDetails.get('username').value && this.userData[i].password == this.loginDetails.get('password').value) {
            this.logIn.loginName = 'loggedIn';
            this.router.navigate(['/admin']);
            return true;
          }
        }
        alert("wrong credentials");
      });
    }
  }
}
