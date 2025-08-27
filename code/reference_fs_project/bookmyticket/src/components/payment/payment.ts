import { ChangeDetectionStrategy, Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-payment',
  imports: [],
  templateUrl: './payment.html',
  styleUrl: './payment.css'

})
export class Payment {

  constructor(private activatedRoute:ActivatedRoute){}

  ngOnInit()
  {
    console.log("-Payment Lopaded-")
    let orderId= this.activatedRoute.snapshot.paramMap.get('orderId');
    console.log(orderId)

  }

}
