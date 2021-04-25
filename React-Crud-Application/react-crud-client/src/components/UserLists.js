import React, {useEffect,useState, Fragment} from "react";
import { connect } from "react-redux";
import * as actions from "../actions/userList";
import { Grid, Paper, withStyles, Divider, List, ListItem, Typography, Button } from "@material-ui/core";
import  RegisterForm  from "./RegisterForm";


const styles = theme => ({
    paper : {
        margin : theme.spacing(3),
        padding : theme.spacing(2)
    },

    spacingMargin : {
        margin : theme.spacing(1)
    }
})




const UserLists = ({classes, ...props}) => {
    const [currentId, setCurrentId ] = useState(0)
    
    //DidMount
    useEffect(() => {
        props.fetchAllUserLists()
    }, [])


    const onDelete = id => {
        const onSuccess = () => {window.alert('deleted successfully.')}
        if(window.confirm('Are you sure to delete this user'))
        props.deleteUser(id,onSuccess)
    }

    return ( <Grid container>
            <Grid item xs={5}>
                <Paper className={classes.paper}>
                    <RegisterForm {...{currentId,setCurrentId}}/>
                </Paper>
            </Grid>
            <Grid item xs={7}>
            <Paper className={classes.paper}>
                <List>
                    {
                        props.userListlist.map((record, index) => {
                            return (
                                <Fragment>
                                <ListItem>
                                    <Typography var>
                                        <summary>
                                        {"Name: "+ record.userName+"  "}
                                        {"EmailId: "+ record.emailId+"  "}
                                        </summary>
                                       <div>
                                           <Button
                                           variant="contained"
                                           color="primary"
                                           size='small'
                                           className={classes.spacingMargin}
                                           onClick={() => setCurrentId(record._id)}>
                                            Edit
                                            </Button>

                                           <Button
                                           variant="contained"
                                           color="secondary"
                                           className={classes.spacingMargin}
                                           onClick={() => onDelete(record._id)}
                                           size="small">
                                           Delete
                                           </Button>
                                       </div>
                                    </Typography>
                                </ListItem>
                                <Divider component="li" />
                                </Fragment>
                            )
                        })
                    }
                </List>
            </Paper>
            </Grid>
             </Grid>
        )
}

const mapStateToProps = state => ({
    userListlist : state.userList.list
})
const mapActionToProps = {
    fetchAllUserLists : actions.fetchAll,
    deleteUser : actions.Delete
}
export default connect(mapStateToProps, mapActionToProps)(withStyles(styles)(UserLists));