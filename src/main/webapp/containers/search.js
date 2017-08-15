import React, { Component } from 'react';

import { connect } from "react-redux";
import { bindActionCreators } from "redux";
import { getToDos } from "../actions/index";

class Search extends Component {
  constructor(props) {
    super(props);

    this.state = { criteria: "" };

    this.handleSearch = this.handleSearch.bind(this);
    this.onInputChange = this.onInputChange.bind(this);
  }

  onInputChange(event) {
    this.setState({ criteria: event.target.value });
  }

  handleSearch() {
    this.props.getToDos(this.state.criteria);
  }

  render() {
    return (
      <div>
        <input type="text" value={this.state.criteria} 
            onChange={this.onInputChange}></input>
        <button  onClick={this.handleSearch}>Search</button>
      </div>
    );
  }
}

function mapDispatchToProps(dispatch) {
  return bindActionCreators({ getToDos }, dispatch);
}

export default connect(null, mapDispatchToProps)(Search);
