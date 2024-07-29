let n = 19;
let str = "";

for(let i = 1; i <= n; i++){
    for(let j = 1; j<= n; j++){
        if(j == n){
            str += `${i} * ${j} = ${i * j}\n`
        }else if(j % 2 == 0){
            str += `/ ${i} * ${j} = ${i * j}\n`
        }else{
            str += `${i} * ${j} = ${i * j} `
        }
    }
}

console.log(str);