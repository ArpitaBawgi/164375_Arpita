const express=require("express");
const app=express();
const bodyParser= require("body-parser");

app.use(bodyParser.json());

//load mongoose
const mongoose=require("mongoose");

require("./Book")
const Book=mongoose.model("Book")

//connect
mongoose.connect("mongodb://jaggu:jaggu123@ds113608.mlab.com:13608/booksservice", { useNewUrlParser: true },() =>{
    console.log("Database connected!"); 
});

/*mongoose.connect("mongodb://localhost/booksservice",() =>{
    console.log("Database connected!");  */
app.get("/", (req,res) =>{
res.send("This is our book service");
})

//create func
app.post("/book", (req,res) => {  
//console.log(req.body);
var newBook= {
    title:req.body.title,
    author:req.body.Author,
    numberPages:req.body.numberPages,
    publisher:req.body.Publisher
}
 var book= new Book(newBook)
 book.save().then( ()=> {
     console.log("New Book Created!");
 }).catch((err) => {
     if(err){
         throw err;
     }
 })
  res.send("A new book created with success!");
})

app.listen(4546,() => {
console.log("Up and Running! -- This is our books service");
console.log("hi There....");

}) 