import axios from 'axios';
export const GET_TODOS = "GET_TODOS";
export function getToDos(criteria) {
	const url = `todos?filter=${criteria}`;
	const request = axios.get(url);
	
	return {
		type: GET_TODOS,
		payload: request
	}
}