var fs = require('fs');
var outputFile = process.argv[2];
var text = process.argv[3];

fs.writeFile("test4.txt" , "hey ho! let's go" + '\n', function(err) {
    if(err) { return console.log(err); }
    console.log("The file was saved!");
});
