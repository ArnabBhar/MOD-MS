import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  mentorData;
  courseName: string;
  flag: boolean = false;
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/assets/mentor.json').subscribe(mentordata => {
      this.mentorData = mentordata;
    })
  }

  searchCourse() {
    if (this.courseName === 'Spring') {
      this.flag = true;
      return;
    }
    this.flag = false;
  }
}
