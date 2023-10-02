import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ciclo-de-vida';
	isAliveCheckSample:boolean = true

	disposeCheckedSample():void{
		this.isAliveCheckSample = false
	}
}
