const fs = require("fs");

let ft = Number(fs.readFileSync(0).toString());

console.log((ft * 30.48).toFixed(1));