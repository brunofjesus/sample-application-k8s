import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {environment} from "../../environments/environment";
import {Observable} from "rxjs";
import {Fact} from "../model/fact.model";

@Injectable({
  providedIn: 'root'
})
export class FactServiceService {

  constructor(
    private http: HttpClient
  ) {}

  getRandomFact(): Observable<Fact> {
    return this.http.get<Fact>(environment.apiUrl + "/fact/random");
  }
}
