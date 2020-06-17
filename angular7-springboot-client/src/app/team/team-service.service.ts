import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class TeamServiceService {

  baseUrl = '/api/v1/team';

  constructor(private httpClient: HttpClient) { }


  getTeamsList(): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}`);
  }
}
