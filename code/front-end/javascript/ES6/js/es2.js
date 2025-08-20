class Employee
{

    constructor(name, age, salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    getDetails()
    {
        return `Name: ${this.name}, Age: ${this.age}, Salary: ${this.salary}`;
    }
}

let  e1= new Employee("John", 30, 50000);
console.log(e1.getDetails());