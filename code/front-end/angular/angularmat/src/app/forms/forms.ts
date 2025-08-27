import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-forms',
  imports: [ReactiveFormsModule],
  templateUrl: './forms.html',
  styleUrl: './forms.css'
})
export class Forms {
submit() {
 if(this.fg.valid)
 {
  console.log("forms submitted")
 }
}

  fg:FormGroup;

  constructor(private fb:FormBuilder){
    this.fg=this.fb.group({
      name:['',Validators.required],
      email:['',[Validators.required,Validators.email]]

    })

  }

}
