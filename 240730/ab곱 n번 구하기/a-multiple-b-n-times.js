const fs = require("fs");
let input = fs.readFileSync(0).toString().trim().split("\n");

let n = Number(input[0]);

for(let i=1;i<=n;i++){
    let line = input[i].split(" ");
    let a = Number(line[0]);
    let b = Number(line[1]);
    let sum = 1;

    for(let j=a;j<=b;j++){
        sum *= j;
    }

    console.log(sum);
}