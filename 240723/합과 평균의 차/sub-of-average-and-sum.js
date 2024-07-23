const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(" ");

let a = Number(input[0]);
let b = Number(input[1]);
let c = Number(input[2]);

let sum = a + b + c;
let avg = parseInt((a + b + c) / 3);
let minus = sum - avg;

console.log(sum);
console.log(avg);
console.log(minus);