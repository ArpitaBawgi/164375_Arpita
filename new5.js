/*$file = file_get_contents("filename.ext");
if (!strpos($file, "apple")) {
    echo "String not found!";
} else {
    echo "String found!";
}
*/

/*var fs = require("fs"), searchString = "somestring";

fs.readFile("somefile.txt", function(err, content) {

    if (err) throw err;

     console.log(content.indexOf(searchString)>-1 ? "has string" : "does not have string");

});*/



var fs = require('fs');
var fileName = 'Hey.txt';
var wordToFind = process.argv[2].toLowerCase();


fs.readFile(fileName, 'utf8', function(err, contentFile) {  
    if (err) throw err;
    var aWordsText = contentFile.toLowerCase().split(' ');
    var aFilteredWords = aWordsText.filter(function(word){
        return word.includes(wordToFind);
    })
    console.log('The word "' + wordToFind + '" appears ' + aFilteredWords.length + " times in the text.");
});