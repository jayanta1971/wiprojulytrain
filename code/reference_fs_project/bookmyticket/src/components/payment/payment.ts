import { CurrencyPipe } from '@angular/common';
import { ChangeDetectionStrategy, Component } from '@angular/core';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { IPayment } from '../../interfaces/payment';
import { Paymentservice } from '../../app/service/paymentservice';
import { NgxMaskDirective, provideNgxMask } from 'ngx-mask';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-payment',
  imports: [CurrencyPipe,NgxMaskDirective,FormsModule],
  templateUrl: './payment.html',
  styleUrl: './payment.css',
  providers: [provideNgxMask()],

})
export class Payment {

  constructor(private activatedRoute:ActivatedRoute,
    private paymentService:Paymentservice,
    private router:Router){}
  totalPrice:any='';
  orderId:any='';
  accountNumber:string='';
  cvv:number=0;
  ngOnInit()
  {

    this.orderId= this.activatedRoute.snapshot.paramMap.get('orderId');
    let price= this.activatedRoute.snapshot.paramMap.get('totalPrice')?.toString();
    this.totalPrice=price;


  }

  async pay()
  {
        let  payment:IPayment={
            orderId:this.orderId,
            totalOrderPrice:this.totalPrice,
            accountNumber:this.accountNumber,
            cvv:this.cvv,
            modeOfPayment:"card"

         };
        (await this.paymentService.save(payment)).subscribe((result: any)=>{

                   console.log(result);
                   this.router.navigate(['paymentsub'])

            })





  }

}
