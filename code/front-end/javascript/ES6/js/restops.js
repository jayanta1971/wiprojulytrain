//rest operator
const showNumbers=function f (a,b,...args){

    console.log(a, b, args);
}

showNumbers(1, 2, 3, 4, 5); // Outputs: 1 2 [3, 4, 5]
showNumbers(10, 20); // Outputs: 10 20 []
showNumbers(1,3,56,7,9,10); // Outputs: 1 3 [56, 7, 9, 10]

