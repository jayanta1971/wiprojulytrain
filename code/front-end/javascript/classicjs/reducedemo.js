let numbers = [1, 2, 3, 4, 5];
// var sum=0;
//  for(let i=0;i<numbers.length;i++){
    
//     sum= sum + numbers[i];
//  }  
let sum=numbers.reduce((acc, num) => {
  return acc + num;  }, 0);
 
 console.log("Sum of numbers is: " + sum);