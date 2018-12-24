/*$file = file_get_contents("filename.ext");
if (!strpos($file, "apple")) {
    echo "String not found!";
} else {
    echo "String found!";
}
*/

var fs = require("fs"), searchString = "somestring";

fs.readFile("somefile.txt", function(err, content) {

    if (err) throw err;

     console.log(content.indexOf(searchString)>-1 ? "has string" : "does not have string");

});