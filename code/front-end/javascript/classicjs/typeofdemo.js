let x="Jayanta";
//console.log(typeof x); // This will log 'undefined' since x is declared but not initialized
let names={
    firstName: "John",
    lastName: "Doe"
};
console.log(typeof names);

let arr=[];

console.log(typeof arr);

let millis=1755067624000; // Example timestamp in milliseconds;
let dt= new Date(millis);
console.log(dt.getVarDate); // This will log 'object' since Date is an object in Java

let num=19;
console.log(`the value of num ${num}`)

console.log("My name is 'Jayanta'")

console.log(Math.random())

let stentance = "madam";
let arr1=stentance.split();
console.log(arr1);

const person = { name: 'Rahul', age: 25, job: 'Developer' };

for (const key in person) {
  console.log(`Key: ${key}, Value: ${person[key]}`);
}
