import { Component } from '@angular/core';
import { Condicomp } from "../condicomp/condicomp";
import { Switchdemo } from "../switchdemo/switchdemo";
import { Home } from "../home/home";

@Component({
  selector: 'app-listcomp',
  imports: [Condicomp, Switchdemo, Home],
  templateUrl: './listcomp.html',
  styleUrl: './listcomp.css'
})
export class Listcomp {

  fruitList: string[] = ['Apple', 'Banana', 'Cherry', 'Date', 'Elderberry'];

}
