import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Actor } from './actor';
import { User } from './user';
import { Mentor } from './mentor';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  loginName: any = 'guest';
  constructor(private http: HttpClient) { }
  private baseUrl = 'http://localhost:8087/auth/';

  getActorCred(userName:String, accountType:String): Observable<Actor>{
    return this.http.get<Actor>(`${this.baseUrl}`+'actordetails/'+ accountType + '/' + userName);  
  }

  getUserCred(userName:String): Observable<User>{
    return this.http.get<User>(`${this.baseUrl}`+'user/details/'+userName);  
  }

  getMentorCred(userName:String): Observable<Mentor>{
    return this.http.get<Mentor>(`${this.baseUrl}`+'mentor/details/'+userName);  
  }
}
