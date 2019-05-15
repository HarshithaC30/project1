var fs = require('fs');
var count = 0;
var s1 = fs.readFileSync('test.txt').toString();
var words = s1.split(" ");

console.log(words);