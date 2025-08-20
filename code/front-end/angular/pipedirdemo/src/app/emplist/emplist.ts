import { Component } from '@angular/core';
import { Empservice } from '../empservice';
import { Employee } from '../employee';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-emplist',
  imports: [FormsModule],
  templateUrl: './emplist.html',
  styleUrl: './emplist.css'
})
export class Emplist {



  emplist: Employee[] = [];
  empId: string = '';
  empIdAdd: string = '';
  empNameAdd: string = '';
  empSalaryAdd: number = 0;
  constructor(private empmService: Empservice) {
    this.emplist = this.empmService.getEmployees();
  }

  delete(): void {
    this.empmService.deleteByEmpId(this.empId);
    this.emplist = this.empmService.getEmployees();
    this.empId = ''; // Clear the input field after deletion

  }

  save() {
    const newEmployee: Employee = {
      empId: this.empIdAdd,
      empName: this.empNameAdd,
      empSalary: this.empSalaryAdd
    };
    this.empmService.addEmployee(newEmployee);
    this.emplist = this.empmService.getEmployees();
    // Clear the input fields after saving
    this.empIdAdd = '';
    this.empNameAdd = '';
    this.empSalaryAdd = 0;
}

update() {
  const newEmployee: Employee = {
      empId: this.empIdAdd,
      empName: this.empNameAdd,
      empSalary: this.empSalaryAdd
    };
    this.empmService.updateEmployee(newEmployee);
    this.emplist = this.empmService.getEmployees();
    // Clear the input fields after saving
    this.empIdAdd = '';
    this.empNameAdd = '';
    this.empSalaryAdd = 0;
}
edit() {
  const employee = this.empmService.findByEmpId(this.empId);
  if (employee) {
    this.empIdAdd = employee.empId;
    this.empNameAdd = employee.empName;
    this.empSalaryAdd = employee.empSalary;
  } else {
    alert('Employee not found');
}
}
}
