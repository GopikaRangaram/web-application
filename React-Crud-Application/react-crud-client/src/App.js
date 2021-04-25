import './App.css';
import React from "react";
import { Provider } from "react-redux"
import { store } from "./actions/store";
import UserLists from './components/UserLists';
import { BrowserRouter as Router, Route, Link, Switch } from 'react-router-dom';
import { Container, AppBar, Typography } from "@material-ui/core";
import LoginForm from './components/LoginForm';
function App() {
  return (
    <Provider store = {store}>
      <Container maxWidth="lg">
        <AppBar position="static" color="inherit">
          <Typography
          variant="h4"
          align="center">
              Self-Service Portal
          </Typography>
          <Router>
            <Link to=""></Link>
            <Switch>
              <Route path="/LoginForm" component={ LoginForm }></Route>
              <Route path="" component= { UserLists }></Route>
              </Switch>
          </Router>
        </AppBar>
        {/* <UserLists/> */}
      </Container>
    </Provider>
  );
}

export default App;
