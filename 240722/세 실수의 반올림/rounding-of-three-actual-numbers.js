const fs = require("fs");

let input = fs.readFileSync(0).toString().split("\n");

console.log(Number(input[0]).toFixed(3));
console.log(Number(input[1]).toFixed(3));
console.log(Number(input[2]).toFixed(3));