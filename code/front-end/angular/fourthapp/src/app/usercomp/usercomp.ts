import { Component } from '@angular/core';
import { UserService } from '../user-service';
import { IUser } from '../iuser';

@Component({
  selector: 'app-usercomp',
  imports: [],
  templateUrl: './usercomp.html',
  styleUrl: './usercomp.css'
})
export class Usercomp {

  constructor(private userService:UserService) { }

  users: IUser[] = [];

  ngOnInit() {
    this.userService.getUsers().subscribe((data: IUser[]) => {

      this.users = data;
      console.log('Users fetched successfully:',  this.users);
    }, (error) => {
      console.error('Error fetching users:', error);
    });
  }

}
