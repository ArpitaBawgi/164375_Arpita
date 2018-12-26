/*var express = require("express");

var app = express();

app.get('/home', function(req, res){
res.end('Hello World!');
});

app.listen(process.argv2);*/

var express = require('express');
var port = process.argv[2];

var app = express();
app.get('/home', function(req, res) {
res.end('Hello World! This is really tricky');
});
app.listen(port);