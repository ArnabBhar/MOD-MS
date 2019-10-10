import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-trainee',
  templateUrl: './trainee.component.html',
  styleUrls: ['./trainee.component.css']
})
export class TraineeComponent implements OnInit {

  mentorData;
  userData;
  searchFlag: boolean = false;
  userFlag: boolean = false;
  userCompleteFlag: boolean = false;

  constructor(private logIn: LoginService, private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/assets/mentor.json').subscribe(mentordata => {
      this.mentorData = mentordata;
    });
    this.http.get('/assets/user_completed.json').subscribe(userdata => {
      this.userData = userdata;
    });
  }

  selectTab(n) {
    this.clearFlag();
    if (n == 1) {
      this.searchFlag = true;
    } else if (n == 2) {
      this.userFlag = true;
    }
    else if (n == 3) {
      this.userCompleteFlag = true;
    }
    else {
      //no nothing
    }

  }

  clearFlag() {
    this.searchFlag = false;
    this.userFlag = false;
    this.userCompleteFlag = false;
  }

}
