import {Component} from '@angular/core';
import {FactServiceService} from "./service/fact-service.service";
import {Observable} from "rxjs";
import {Fact} from "./model/fact.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public fact: string = "";

  constructor(
    private factService: FactServiceService
  ) {
    this.fetchFact();
  }

  public fetchFact() {
    this.factService.getRandomFact()
      .subscribe((fact) => this.fact = fact.content)
  }
}
