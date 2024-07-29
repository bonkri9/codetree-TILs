const fs = require("fs");
let n = Number(fs.readFileSync(0).toString().trim());

let alpha = 'A';
let str = "";

for(let i=0;i<n;i++){
    for(let j=0;j<=i;j++){
        str += alpha;
        let idx = alpha.charCodeAt();
        idx++;
        alpha = String.fromCharCode(idx);
    }
    str += "\n";
}

console.log(str);