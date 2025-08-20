import { Component } from '@angular/core';
import { Product } from "../product/product";
import { IProduct } from '../iproduct';

@Component({
  selector: 'app-home',
  imports: [Product],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {


remove(prodCode:string) {
  console.log("Remove button clicked-"+prodCode);
  this.items= this.items.filter(item => item.productCode !== prodCode);
}

  items:IProduct[]=
  [{


    productCode: 'prod01',
    productDescription: 'iPhone16Plus',
    prodPrice: 1000
  },{
    productCode: 'prod02',
    productDescription: 'iPhone16Pro',
     prodPrice: 1000
  },{
    productCode: 'prod03',
    productDescription: 'iPhone16ProMax',
     prodPrice: 1000
  }]


}
