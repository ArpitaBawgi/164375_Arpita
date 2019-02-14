var express = require('express');
var app = express();

app.post('/hello', function(req, res){
   res.send("Hello World you idiot,this is post method!");
});
app.listen(3000);