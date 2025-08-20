import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appColordir]'
})
export class Colordir {

  constructor(private elementRef:ElementRef) {

  this.elementRef.nativeElement.style.color = 'blue';
    this.elementRef.nativeElement.style.fontSize = '20px';
    this.elementRef.nativeElement.style.fontWeight = 'bold';
   }

}
