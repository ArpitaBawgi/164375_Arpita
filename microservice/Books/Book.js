const mongoose = require("mongoose");
mongoose.model("Book",{

    //title, author, numberPages, publishers

    title :{
        type: String,
        require: true
     },

    author: {
        type: String,
        require: false
    },
numberPages:{
    type: Number,
    require: false
     },
     
     publisher: {
         type:String,
         require:false
     }


});