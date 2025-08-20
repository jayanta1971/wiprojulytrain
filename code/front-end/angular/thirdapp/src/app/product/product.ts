import { Component, EventEmitter, Input, Output } from '@angular/core';
import { IProduct } from '../iproduct';

@Component({
  selector: 'app-product',
  imports: [],
  templateUrl: './product.html',
  styleUrl: './product.css'
})
export class Product {

  // @Input() productCode: string='';
  // @Input() productDescription: string='';
  @Input() product:IProduct = {
    productCode: '',
    productDescription: '',
    prodPrice: 0
  };
  @Output() btnClick = new EventEmitter<string>();

  onClick(prodCode:string) {
    console.log("Clicked-"+prodCode);
    this.btnClick.emit(prodCode);

}


}
