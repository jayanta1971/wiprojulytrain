import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'kgtg'
})
export class KgtgPipe implements PipeTransform {

  transform(value: number, arg:string): string {
    return value* 1000 + arg;
  }

}
