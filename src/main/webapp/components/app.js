import React, { Component } from 'react';
import Search from '../containers/search';
import ToDoList from '../containers/todo_list';

export default class App extends Component {
  render() {
    return (
      <div>
        <Search/>
        <ToDoList/>
      </div>
    );
  }
}