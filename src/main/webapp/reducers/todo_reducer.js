import { GET_TODOS } from "../actions/index";

export default function(state = [], action) {
  switch (action.type) {
    case GET_TODOS:
      return action.payload.data;
  }
  return state;
}