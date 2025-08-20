// function f(a , b=4) {
//     console.log(a, b);
// }


// console.log(f(2, 3)); // 2 3
// console.log(f(2)); // 2 4

const f=(a) => {
    console.log(a);
}

f(4);

const f1=(a, b=4) => {
    console.log(a, b);
}
f1(2, 3); // 2 3
f1(2); // 2 4

// f(4, 5); // Error: f is not a function