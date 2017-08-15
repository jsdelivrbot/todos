import { combineReducers } from "redux";
import ToDoReducer from "./todo_reducer";

const rootReducer = combineReducers({
  todos: ToDoReducer
});

export default rootReducer;