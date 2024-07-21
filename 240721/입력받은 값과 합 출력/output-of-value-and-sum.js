const fs = require("fs");
let arr = fs.readFileSync(0).toString().split(" ");

console.log(arr[0], arr[1], Number(arr[0]) + Number(arr[1]) );