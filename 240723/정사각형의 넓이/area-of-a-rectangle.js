const fs = require("fs");

let n = Number(fs.readFileSync(0).toString().trim());

console.log(n ** 2);

if(n < 5) console.log("tiny");