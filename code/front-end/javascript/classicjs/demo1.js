
// for(let i=0;i<10;i++){
//     console.log(i);
// }
let numbers=[1,6,8,9,10,12,15,20];

let  evenNumbers=numbers.filter((num)=>num%2==0); 
let doubledNumbers=evenNumbers.map((num)=>num*2);
console.log(doubledNumbers);

