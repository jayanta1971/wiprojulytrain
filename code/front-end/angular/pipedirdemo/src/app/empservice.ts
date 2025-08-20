import { Injectable } from '@angular/core';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class Empservice {

  emplList:Employee[] = [
    { empId: '101', empName: 'Jayanta', empSalary: 1000.1247678 },
    { empId: '102', empName: 'Ravi', empSalary: 2000.5678901 },
    { empId: '103', empName: 'Sita', empSalary: 1500.3456789 }
  ];

  getEmployees(): Employee[] {
    return this.emplList;
  }

  deleteByEmpId(empId: string): void {
    this.emplList = this.emplList.filter(emp => emp.empId !== empId);
  }
  addEmployee(emp: Employee): void {
    this.emplList.push(emp);
  }
  findByEmpId(empId: string): Employee | undefined {
    return this.emplList.find(emp => emp.empId === empId);
  }

   updateEmployee(emp: Employee): void {
    const index = this.emplList.findIndex(e => e.empId === emp.empId);
    if (index !== -1) {
      this.emplList[index] = emp;
    } else {
      console.error(`Employee with empId ${emp.empId} not found.`);
    }
  }

}
