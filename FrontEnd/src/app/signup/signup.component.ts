import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { Actor } from 'src/app/actor';
import { User } from 'src/app/user';
import { Mentor } from 'src/app/mentor';
import { SignupService } from 'src/app/signup.service';
import { Mentorcalendar } from 'src/app/mentorcalendar';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  isSuccess = false;
  message = "";
  isFailed = false;

  userSignUp = new FormGroup({
    fullName: new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required, Validators.email]),
    phoneNumber: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    presentAddress: new FormControl('', Validators.required),
    permanentAddress: new FormControl('', Validators.required),
    nidNumber: new FormControl('', Validators.required)
  });
  mentorSignUp = new FormGroup({
    fullName: new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required, Validators.email]),
    phoneNumber: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    presentAddress: new FormControl('', Validators.required),
    permanentAddress: new FormControl('', Validators.required),
    nidNumber: new FormControl('', Validators.required),
    yearExp: new FormControl('', Validators.required),
  });
  constructor(private signUp: SignupService) { }

  user: User = new User();
  actor: Actor = new Actor();
  trainer: Mentor = new Mentor();

  ngOnInit() {
  }
  validFormTrainee() {
    var fullName = document.forms["formTrainee"]["full_name"].value;
    if (fullName == "") {
      alert("Name must be filled out");
      return false;
    }
  }
  validFormTrainer() {
    var fullName = document.forms["formTrainer"]["full_name"].value;
    if (fullName == "") {
      alert("Name must be filled out");
      return false;
    }
  }

  mentorSignUpFun() {

    if (this.mentorSignUp.get('fullName').value == '') {
      this.message = "Name Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if (this.mentorSignUp.get('email').value == '') {
      this.message = "Email Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if (this.mentorSignUp.get('phoneNumber').value == '') {
      this.message = "Phone Number Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if (this.mentorSignUp.get('password').value == '') {
      this.message = "Password cannot be empty !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else {
      this.isSuccess = true;
      this.isFailed = false;
    }
    if (this.isSuccess == true) {
      this.actor.actorEmail = this.mentorSignUp.get('email').value;
      this.actor.actorPassword = this.mentorSignUp.get('password').value;
      this.actor.actorStatus = true;
      this.actor.actorType = "Trainer";

      this.trainer.mentorEmail = this.mentorSignUp.get('email').value;
      this.trainer.mentorName = this.mentorSignUp.get('fullName').value;
      this.trainer.mentorPhone = this.mentorSignUp.get('phoneNumber').value;
      this.trainer.mentorYearsExp = this.mentorSignUp.get('years').value;
      this.trainer.mentorLinkdin = this.mentorSignUp.get('linkdin').value;

      this.trainer.actor = this.actor;

      this.createTrainer();
      alert("Trainer registered successfully. Go to Log In");
    }
    if (this.isFailed == true) {
      alert('Fill out the details properly');
    }
  }

  createTrainer() {
    this.signUp.createTrainer(this.trainer).subscribe(data => console.log(data), error => console.log(error));
  }
  userSignUpFun() {
    if (this.userSignUp.get('fullName').value == '') {
      this.message = "Name Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if (this.userSignUp.get('email').value == '') {
      this.message = "Email Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if (this.userSignUp.get('phoneNumber').value == '') {
      this.message = "Phone Number Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if (this.userSignUp.get('password').value == '') {
      this.message = "Password cannot be empty !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else {
      this.isSuccess = true;
      this.isFailed = false;
    }
    if (this.isSuccess == true) {
      this.actor.actorEmail = this.userSignUp.get('email').value;
      this.actor.actorPassword = this.userSignUp.get('password').value;
      this.actor.actorStatus = true;
      this.actor.actorType = "Trainee";

      this.user.userEmail = this.userSignUp.get('email').value;
      this.user.userName = this.userSignUp.get('fullName').value;
      this.user.userPhone = this.userSignUp.get('phoneNumber').value;
      this.user.actor = this.actor;

      this.createUser();
      alert("Trainee registered successfully. Go to Log In");
    }
    if (this.isFailed == true) {
      alert('Fill out the details properly');
    }
  }

  createUser() {
    this.signUp.createUser(this.user).subscribe(data => console.log(data), error => console.log(error));
  }

}
