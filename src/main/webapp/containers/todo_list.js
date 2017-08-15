import React, { Component } from "react";
import { connect } from "react-redux";
//import Chart from "../components/chart";
//import GoogleMap from "../components/google_map";

class ToDoList extends Component {
  renderTodos(todo) {

    return (
      <li key={todo.content}>
        {todo.content}
      </li>
    );
  }

  render() {
    return (
      <ul>
          {this.props.todos.map(this.renderTodos)}
      </ul>
    );
  }
}

function mapStateToProps({ todos }) {
  return { todos };
}

export default connect(mapStateToProps)(ToDoList);