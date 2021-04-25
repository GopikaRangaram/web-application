const express = require('express')
const router = express.Router()
const User = require('../Model/Register')
const mongoose = require('mongoose')
//to fetch all data
router.get('/', async(req,res) =>{
   try{
      const user = await User.find().select("userName emailId password")
      res.json(user)
   } catch(err){
      res.send('Error ' + err)
   }
})


router.get('/:id', async(req,res) =>{
   try{
      const user = await User.findById(req.params.id).select("userName emailId password")
      res.json(user)
   } catch(err){
      res.send('Error ' + err)
   }
})

 //to insert document
 router.post('/', async(req,res) => {
    const user =  new User({
        _id: new mongoose.Types.ObjectId(),
        userName: req.body.userName,
        emailId: req.body.emailId,
        password: req.body.password
    })

    try{
        const resultSet = await user.save()
         res.json(resultSet)
    } catch(err){
        res.send('Error' + err)
    }
})


//to delete the document
router.delete('/:id', async(req,res) =>{
   try{
      const user = await User.findByIdAndRemove(req.params.id)
      const resultSet = await user.save()
      res.json(resultSet)
   } catch(err){
      res.send('Error ' + err)
   }
})

//to patch the document
router.patch('/:id', async(req,res) =>{
   try{
      const user = await User.findById(req.params.id)
      user.userName = req.body.userName,
      user.emailId = req.body.emailId,
      user.password = req.body.password
      const resultSet = await user.save()
      res.json(resultSet)

   } catch(err){
      res.send('Error ' + err)
   }
})
module.exports =  router