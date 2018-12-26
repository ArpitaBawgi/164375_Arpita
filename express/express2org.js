var express=require('express');
var app=express();

app.get('/year/:age', function(req,res){
    var age=req.params.age;
    var year=2018-age;
    res.send("hello, your Birth year is: "+year);
}).listen(3551);