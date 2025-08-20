
const promise = new Promise((resolve, reject) => {      
  // Simulating an asynchronous operation
  setTimeout(() => {
  resolve("API call is successful");
},1000); // 1000 milliseconds = 1 second 
});

 promise.then((result) => {
  console.log(result); 
});