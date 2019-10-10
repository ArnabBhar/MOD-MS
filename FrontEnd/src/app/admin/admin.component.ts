import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  traineeData;
  courseData;
  paymentData;
  userData;
  mentorData;
  flag1: boolean = false;
  flag2: boolean = false;
  flag3: boolean = false;
  flag4: boolean = false;

  constructor(private logIn: LoginService, private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/assets/training.json').subscribe(traineedata => {
      this.traineeData = traineedata;
    });
    this.http.get('/assets/course.json').subscribe(coursedata => {
      this.courseData = coursedata;
    });
    this.http.get('/assets/payment.json').subscribe(paymentdata => {
      this.paymentData = paymentdata;
    });
    this.http.get('/assets/users.json').subscribe(userdata => {
      this.userData = userdata;
    });
    this.http.get('/assets/mentor.json').subscribe(mentordata => {
      this.mentorData = mentordata;
    });
  }

  clearFlag() {
    this.flag1 = false;
    this.flag2 = false;
    this.flag3 = false;
    this.flag4 = false;
  }

  selectTab(n) {
    this.clearFlag();
    if (n == 1) {
      this.flag1 = true;
    } else if (n == 2) {
      this.flag2 = true;
    }
    else if (n == 3) {
      this.flag3 = true;
    }
    else if (n == 4) {
      this.flag4 = true;
    }
    else {
      //no nothing
    }
  }
  block(i, type) {
    if (type == 'user') {
      this.userData[i].status = "blocked";
    } else
      this.mentorData[i].status = "blocked";

  }
  unblock(i, type) {
    if (type == 'user') {
      this.userData[i].status = "unblocked";
    } else
      this.mentorData[i].status = "unblocked";

  }
}
