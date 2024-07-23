const fs = require("fs");

let a = Number(fs.readFileSync(0).toString().trim());

console.log(a == 1 ? "t" : "f");