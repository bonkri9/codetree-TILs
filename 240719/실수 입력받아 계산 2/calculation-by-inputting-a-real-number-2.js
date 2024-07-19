const fs = require("fs");

let a = Number(fs.readFileSync(0).toString());

console.log((a+1.5).toFixed(2));