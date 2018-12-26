var express = require('express');
//var app = express();

express().get('/', function(req, res){
   res.send("Hello world sneha!");
}).listen(3030);

//app.listen(3030);

/*here we are using express framework instead of creating server */