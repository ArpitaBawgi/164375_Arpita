
var express = require('express');
var app = express();
var bodyParser= require('body-parser');
var urlencoderParser= bodyParser.urlencoded({extended:false});

app.use(express.static('public'));
app.get('/exp.html', function (req, res) {
   res.sendFile( __dirname + "/" + "exp.html" );
})

app.post('/process_post',urlencoderParser, function (req, res) {
   // Prepare output in JSON format
   response = {
      username:req.body.Username,
      Password:req.body.password
   };
   console.log(response);
   res.end(JSON.stringify(response));
})        

var server = app.listen(3031, function () {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
});
/*for post u must use body 
for get we use query*/