var fs = require('fs');

//create a file named mynewfile1.txt:
fs.appendFile('node.txt', 'Hello content!', function (err) {
  if (err) throw err;
  console.log('Saved!');
});