const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split("\n");

let n = Number(input[0]);

for(let i=1;i<=n;i++){
    let x = Number(input[i]);
    if(x % 2 === 1 && x % 3 === 0){
        console.log(x);
    }
}