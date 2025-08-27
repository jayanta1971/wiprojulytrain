import {ChangeDetectionStrategy, Component} from '@angular/core';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {FormsModule} from '@angular/forms';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';

@Component({
  selector: 'app-root',
imports: [MatFormFieldModule, MatInputModule, FormsModule, MatButtonModule, MatIconModule],

  templateUrl: './app.html',
  styleUrl: './app.css',
   changeDetection: ChangeDetectionStrategy.OnPush,
})
export class App {
  protected title = 'matdemo1';
}
