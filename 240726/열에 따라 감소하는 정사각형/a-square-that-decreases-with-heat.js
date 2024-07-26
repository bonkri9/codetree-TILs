const fs = require("fs");
let n = Number(fs.readFileSync(0).toString().trim());

for(let i=0;i<n;i++){
    let str = "";
    for(let j=n;j>=1;j--){
        str += j + " ";
    }
    console.log(str);
}