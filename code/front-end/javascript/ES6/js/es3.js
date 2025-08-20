const employee={
    firstName: "John",
    lastName: "Doe"

}

// console.log(employee.firstName + "--" + employee.lastName);

const {firstName,lastName}= employee;
console.log(`${firstName} ${lastName}`);