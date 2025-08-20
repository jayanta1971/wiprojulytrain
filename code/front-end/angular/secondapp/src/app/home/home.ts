import { Component } from '@angular/core';
import { Product } from "../product/product";
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  imports: [Product,FormsModule,CommonModule],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

  num:number[]=[1,2,3,4,5,6,7,8,9,10];
  x: boolean=false;
  flag:boolean=false;
}
