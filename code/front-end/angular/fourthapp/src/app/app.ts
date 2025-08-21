import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Usercomp } from "./usercomp/usercomp";

@Component({
  selector: 'app-root',
  imports: [Usercomp],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected title = 'fourthapp';
}
