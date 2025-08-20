import { NgStyle} from '@angular/common';
import { Component } from '@angular/core';
   @Component({
  selector: 'app-root',
  imports: [NgStyle],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'thirdapp';
  flag1:boolean = false;
  flag2:boolean = true;
  color1:string = 'blue';
  fontSize1:string = '20px';

   getClass()
   {
    return {
      app1: this.flag1,
      app2: this.flag2
    }
   }
}
