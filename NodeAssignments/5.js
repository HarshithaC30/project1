
var fs = require('fs');
var count = 0;
var s1 = fs.readFileSync('test.txt').toString();
var words = s1.split(" ");
var s = 'Hello';
for(i in words)
{
    if(s==words[i])
    {
        count++;
    }
}
console.log(count);
