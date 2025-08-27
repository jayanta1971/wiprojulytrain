import { ChangeDetectionStrategy, Component } from '@angular/core';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import { FormControl, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { Forms } from "./forms/forms";
import { Reactive1 } from "./reactive1/reactive1";
import { Reactive2 } from "./reactive2/reactive2";
@Component({
  selector: 'app-root',
  imports: [ReactiveFormsModule, Forms, Reactive1, Reactive2],
  // imports: [ MatSlideToggleModule,MatCardModule,MatInputModule,FormsModule,MatIconModule,MatListModule],
  templateUrl: './app.html',
  styleUrl: './app.css',
   changeDetection: ChangeDetectionStrategy.OnPush,
})
export class App {
  protected title = 'angularmat';
   value:string="jayanta";

   name=new FormControl('');

   constructor()
   {
    this.name.valueChanges.subscribe((value)=>{
      console.log("Value changes="+this.name.value)
    })
   }
}
