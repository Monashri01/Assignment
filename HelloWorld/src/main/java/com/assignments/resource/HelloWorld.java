package com.assignments.resource;

public class HelloWorld {
	private String msg;

	public HelloWorld() {

	}

	public HelloWorld(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloWorld [msg=" + msg + "]";
	}

}
