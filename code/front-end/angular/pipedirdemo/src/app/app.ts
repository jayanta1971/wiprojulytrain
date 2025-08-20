import { Component } from '@angular/core';
import { UpperCasePipe } from '@angular/common';
import { CurrencyPipe } from '@angular/common';
import { DatePipe } from '@angular/common';
import { JsonPipe } from '@angular/common';
import { PercentPipe } from '@angular/common';
import { KgtgPipe } from './kgtg-pipe';
import { Colordir } from './colordir';
import { Emplist } from "./emplist/emplist";
import { Empservice } from './empservice';
import { Employee } from './employee';


@Component({
  selector: 'app-root',
  imports: [Emplist],

  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'pipedirdemo';



  // firstName:string = 'jayanta';
  // accountBalance:number = 1000.1247678;
  // modifedDate='2025-08-10T10:00:00Z';
  // employee={empName:'Jayanta',empId:101,empSalary:1000.1247678,empDOB:new Date('2025-08-10T10:00:00Z')};
  // gain:number=.08;
}
