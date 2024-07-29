const fs = require("fs");
let n = Number(fs.readFileSync(0).toString().trim());

let alpha = 'A';
let str = "";

for(let i=0;i<n;i++){
    for(let j=0;j<n;j++){
        str += alpha;
        let index = alpha.charCodeAt();
        index++;
        alpha = String.fromCharCode(index);
    }
    str += "\n";
}

console.log(str);