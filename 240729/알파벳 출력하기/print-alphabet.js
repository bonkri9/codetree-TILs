const fs = require("fs");
let n = Number(fs.readFileSync(0).toString().trim());

let idx = 'A'.charCodeAt();
let str = "";

for(let i=0;i<n;i++){
    str = "";
    for(let j=0;j<=i;j++){
        str += String.fromCharCode(idx);
        if(String.fromCharCode(idx) == 'Z'){
            idx = 'A'.charCodeAt();
        }else{
            idx++;
        }
    }
    console.log(str);
}