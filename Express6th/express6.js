/* var express = require('express');
var app = express(); */
var app = require('express')();
//Serves all the request which includes /images in the url from Images folder
/* app.use('/images', express.static(__dirname + '/Images')); */
app.use(express.static('public'));
var server = app.listen(5000);