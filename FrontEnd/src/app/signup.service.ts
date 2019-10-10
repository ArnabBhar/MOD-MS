import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';
import { Mentor } from './mentor';

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  private baseUrl = 'http://localhost:8087/auth';

  constructor(private http: HttpClient) { }

  createUser(user: User): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + '/user/signup', user);
  }

  createTrainer(trainer: Mentor): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + '/mentor/signup', trainer);
  }

}