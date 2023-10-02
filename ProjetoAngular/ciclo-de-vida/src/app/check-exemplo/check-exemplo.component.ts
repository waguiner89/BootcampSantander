import { Component, OnInit, DoCheck, AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-check-exemplo',
  templateUrl: './check-exemplo.component.html',
  styleUrls: ['./check-exemplo.component.css']
})
export class CheckExemploComponent implements OnInit,
	DoCheck, AfterContentChecked, AfterContentInit, AfterViewChecked,
	AfterViewInit, OnDestroy {

	quantidade:number = 0;

	constructor (){}
	ngOnDestroy(): void {
		console.log("GoodBye Fellas!")
	}

	adicionar(){
		this.quantidade += 1;
	}

	decrementar(){
		this.quantidade -=1;
	}

	ngAfterViewInit(): void {
		console.log("ngAfterViewInit")
	}
	ngAfterViewChecked(): void {
		console.log("ngAfterViewChecked")
	}
	ngAfterContentInit(): void {
		console.log("ngAfterContentInit")
	}
	ngAfterContentChecked(): void {
		console.log("ngAfterContentChecked")
	}
	ngDoCheck(): void {
		console.log("ngDoCheck")
	}

	ngOnInit(): void {
		console.log("ngOnInit")
	}

}
