import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive2',
  imports: [ReactiveFormsModule],
  templateUrl: './reactive2.html',
  styleUrl: './reactive2.css',
})
export class Reactive2 {
  fg: FormGroup;

  constructor(private fb: FormBuilder) {
    this.fg = this.fb.group({
      fName: ['jay',Validators.required],
      email: ['',[Validators.required,Validators.email]]
    });
  }
  onSubmit() {
      console.log("onSubmit")
      if(this.fg.valid)
      {
         console.log(this.fg.controls['fName'].value)
      }

  }
}
