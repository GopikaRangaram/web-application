import React,{useEffect,useState} from "react";
import { TextField,withStyles,Button} from '@material-ui/core';
import { connect } from 'react-redux';
import * as actions from "../actions/userList"
import { useHistory } from 'react-router-dom';
import LoginForm from "./LoginForm";
import { Redirect } from 'react-router-dom'

const initialFieldValues = {
    userName: '',
    emailId: '',
    password: ''
}


const styles = theme => ({
    root: {
        '& .MuiTextField-root': {
          margin: theme.spacing(1),
          width:'35ch'
        },
      },
      form: {
          justifyContent:'center',
      },
      button: {
          width:"50%"
      }
})
const RegisterForm = ({classes,...props}) => {

    useEffect(() => {
        if(props.currentId!=0) {
            setValues({
                ...props.userListlist.find(x => x._id == props.currentId)
            })
        }
    },[props.currentId])


const [values,setValues] = useState(initialFieldValues)

const [errors,setErrors] = useState({})

const validate = () => {
    let temp = {...errors}
    temp.userName  = values.userName?"":"This field is required."
    temp.emailId  = values.emailId?"":"This field is required."
    temp.password  = values.password?"":"This field is required."
    setErrors({
        ...temp
    })
    return Object.values(temp).every(x => x=="")//iterating each element to check if all data is filled
}

const handleInputChange = e => {
    const {name,value} = e.target
    setValues({
        ...values,
        [name]:value
    })
}
const handleSubmit = e => {
    e.preventDefault() //prevents  reloading
    const onSuccess = () => {window.alert('registered successfully.')}
    if(validate()){
        window.alert('validation succeeded!')
    if(props.currentId==0) 
        props.createUser(values,onSuccess)
    else
        props.updateUser(props.currentId,values,onSuccess)
    console.log(values)
    }
}

const history = useHistory();
const movetoLogin = () => { 
    history.push('/LoginForm');
}

    return ( 
        <form autoComplete="off" className={`${classes.root} ${classes.form}`} onSubmit={handleSubmit}>
           <TextField 
           name="userName"
           variant="outlined"
           label="Name"
           value={values.userName}
           onChange={handleInputChange}
           {...(errors.userName && {error:true, helperText:errors.userName})}
           />
           

           <TextField 
           name="emailId"
           variant="outlined"
           label="Email-Id"
           onChange={handleInputChange}
           {...(errors.emailId && {error:true, helperText:errors.emailId})}
           value={values.emailId}
           /> 


           <TextField 
           name="password"
           variant="outlined"
           label="password"
           onChange={handleInputChange}
           {...(errors.password && {error:true, helperText:errors.password})}
           value={values.password}
           type="password"
           fullWidth />

           <Button 
           variant="contained"
           color="primary"
           size="small"
           type="submit"
           className={classes.button}
           >
            register
           </Button>
           
           <Button 
           variant="contained"
           color="primary"
           size="small"
           type="button"
           onClick={movetoLogin}
           className={classes.button}
           >
           Login
           </Button>
        </form>
    );
}

const mapStateToProps = state => ({
    userListlist : state.userList.list
})
const mapActionToProps = {
    createUser : actions.create,
    updateUser :actions.update
}

export default connect(mapStateToProps,mapActionToProps)(withStyles(styles)(RegisterForm));