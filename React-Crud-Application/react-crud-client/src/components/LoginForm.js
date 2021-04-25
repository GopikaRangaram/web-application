import { Grid,TextField,withStyles,Button} from '@material-ui/core';
import React,{useEffect,useState} from "react";

const initialFieldValues = {
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
      },
      grid: {
        width:"50%"
    }
})



const LoginForm = ({classes,...props}) => {

    const [values,setValues] = useState(initialFieldValues)

    const [errors,setErrors] = useState({})

    const handleInputChange = e => {
        const {name,value} = e.target
        setValues({
            ...values,
            [name]:value
        })
    }
    
    const validate = () => {
        let temp = {...errors}
        temp.emailId  = values.emailId?"":"This field is required."
        temp.password  = values.password?"":"This field is required."
        setErrors({
            ...temp
        })
        return Object.values(temp).every(x => x=="")//iterating each element to check if all data is filled
    }


    const handleSubmit = e => {
        e.preventDefault() //prevents  reloading
        const onSuccess = () => {window.alert('logged in successfully.')}
        if(validate()){
            window.alert('validation succeeded!')
         //props.createUser(values,onSuccess)
        console.log(values)
        }
    }

    return (
        <Grid className={classes.grid}> 
        <form autoComplete="off" className={`${classes.root} ${classes.form}`} onSubmit={handleSubmit}>
           <TextField 
           name="emailId"
           variant="outlined"
           label="Email-Id"
           onChange={handleInputChange}
           {...(errors.emailId && {error:true, helperText:errors.emailId})}
           value={values.emailId}
           fullWidth /> 


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
           Login
           </Button>
        </form>
        </Grid>
    )
}
export default withStyles(styles)(LoginForm);