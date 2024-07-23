const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split(":");

let h = Number(input[0]) + 1;
let m = Number(input[1]);

console.log(`${h}:${m}`);