package com.huttger.joshua;

public class Plant {

	private final long id;
	private final String content;

	public Plant(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
