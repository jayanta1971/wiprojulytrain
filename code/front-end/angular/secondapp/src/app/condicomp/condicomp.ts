import { Component } from '@angular/core';

@Component({
  selector: 'app-condicomp',
  imports: [],
  templateUrl: './condicomp.html',
  styleUrl: './condicomp.css'
})
export class Condicomp {

 flag: boolean = true


toggle() {
  this.flag = !this.flag;
}

}
