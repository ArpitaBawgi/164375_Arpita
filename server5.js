/* var fs = require('fs');
var count=0;
fs.readFile('message.txt',function(err,items){

    for(i=0;i<items.length;i++){
        for(j=0;j<items.length;j++)
        console.log(items.length);
        if(items[i]==items[j])
        count++;
    }
    console.log(count);
}); */
var fs = require('fs');
fs.readFile('message.txt','utf8',function (err, data) {
    if (err) throw err;
    if(data.indexOf('is')){
     console.log(data);
    }
  });