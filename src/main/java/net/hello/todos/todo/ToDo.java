package net.hello.todos.todo;

public class ToDo {
	
	private String content;//what is to be done?
	
	private boolean done;//is it done?

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
