const express = require('express')
const mongoose = require('mongoose')
const url = "mongodb+srv://Gopika:gopika@cluster0.7pojy.mongodb.net/User?retryWrites=true&w=majority"
const app = express()
const bodyParser = require('body-parser');
const cors = require('cors');

mongoose.connect(url,{useNewUrlParser:true})
const con = mongoose.connection

con.on('open', () => {
 console.log('connected')
})

app.use(bodyParser.urlencoded({ extended:true}))
app.use(bodyParser.json());
app.use(express.json());
app.use(cors());
app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*"); // update to match the domain you will make the request from
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
  });
const userRouter = require('../Controller/RegiterationController')
app.use('/RegisterationController',userRouter)
app.listen(9001, function(){
    console.log('server started')
})