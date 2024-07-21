const fs = require("fs");

let input = fs.readFileSync(0).toString();

let arr = input.split(" ");

console.log(arr[0] * arr[1]);