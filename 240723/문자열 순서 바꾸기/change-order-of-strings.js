const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split("\n");
let s = input[0];
let t = input[1];

[s,t] = [t,s];

console.log(s);
console.log(t);