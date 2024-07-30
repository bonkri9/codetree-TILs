const fs = require("fs");
let n = Number(fs.readFileSync(0).toString().trim());

let str = "";
for(let i=1;i<=n;i++){
    let cnt = 0;
    for(let j=n;j>=1;j--){
        if(i%j===0) cnt++;
    }
    if(cnt===2) str += i + " ";
}

console.log(str);