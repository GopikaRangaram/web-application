//to combine the objects of each entity
import  { combineReducers } from "redux";
import { userList } from "./userList";

export const reducers = combineReducers({
    userList
})