
package com.solairis.forsquirrels.messageboard;

class Post {
	
	private final String subject;
	private final String author;

	Post(String subject, String author) {
		this.subject = subject;
		this.author = author;
	}
	
	public String subject() {
		return this.subject;
	}

	public String author() {
		return this.author;
	}

}
