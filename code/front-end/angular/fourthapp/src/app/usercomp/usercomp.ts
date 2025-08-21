import { Component } from '@angular/core';
import { UserService } from '../user-service';
import { IUser } from '../iuser';
import { FormsModule } from '@angular/forms';


import { CommonModule } from '@angular/common';
import { ChangeDetectorRef } from '@angular/core';
@Component({
  selector: 'app-usercomp',
  imports: [CommonModule,FormsModule],
  templateUrl: './usercomp.html',
  styleUrl: './usercomp.css'
})
export class Usercomp {

  constructor(private userService:UserService, private cdr:ChangeDetectorRef) { }

  users: IUser[] = [];
  userEdit: IUser = {
    id: '',
    userName: '',
    email: '',
    password: ''
  };
  userAdd: IUser = {
    id: '',
    userName: '',
    email: '',
    password: ''
  };

  ngOnInit() {
  this.userService.getUsers().subscribe((data: IUser[]) => {
    console.log('Data received:', data); // Check if data is received on refresh
    this.users = data;
    this.cdr.detectChanges();
    console.log('Users fetched successfully:', this.users);
  }, (error) => {
    console.error('Error fetching users:', error);
  });
}

  edit(userId: string) {
    console.log('Edit user with ID:', userId);
    this.userService.getUsersById(userId).subscribe((user: IUser) => {
      console.log('User details:', user);
      this.userEdit = user;
      console.log('User for editing:', this.userEdit);
       this.cdr.detectChanges();
    }, (error) => {
      console.error('Error fetching user by ID:', error);
    });
  }
update() {
  console.log('Updating user:', this.userEdit);
    this.userService.saveUser(this.userEdit).subscribe((updatedUser: IUser) => {
      console.log('User updated successfully:', updatedUser);
      const index = this.users.findIndex(user => user.id === updatedUser.id);
      if (index !== -1) {
        this.users[index] = updatedUser;
      }
      this.userEdit = {
        id: '',
        userName: '',
        email: '',
        password: ''
      };
      this.cdr.detectChanges();
      this.ngOnInit();
    }, (error) => {
      console.error('Error updating user:', error);
    });
}

delete(userId: string) {
  this.userService.deleteUser(userId).subscribe(() => {
    console.log('User deleted successfully:', userId);
    this.users = this.users.filter(user => user.id !== userId);
    this.cdr.detectChanges();
    this.ngOnInit();
  }, (error) => {
    console.error('Error deleting user:', error);
  });


}

save(){

  console.log("saving data-"+this.userAdd)
  this.userService.saveUser(this.userAdd).subscribe((newUser: IUser) => {
    console.log('User saved successfully:', newUser);
    this.users.push(newUser);
    this.userAdd = {
      id: '',
      userName: '',
      email: '',
      password: ''
    };
    this.cdr.detectChanges();
  }, (error) => {
    console.error('Error saving user:', error);
  });

}
}
