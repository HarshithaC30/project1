var http = require('http');
var port = 3000;

var server = http.createServer();

function handleRequest(request, response) {
  console.log(request.url)
  response.end('Hello Server!!')
}

function onListening() {
  console.log("Success, i'm listening from port: 3000")
}

server.on('request', handleRequest)
server.on('listening', onListening)

server.listen(3000);
