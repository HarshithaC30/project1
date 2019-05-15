var fs = require('fs');
var files = fs.readdirSync(__dirname);

files.forEach ( function(file, i) {
	var isDirectory = fs.lstatSync(file).isDirectory();
	console.log ((isDirectory ? "DIR :" : "FILE:") + file)
})