
package com.solairis.forsquirrels.messageboard;

import java.util.Date;

class Post {
	
	private final String subject;
	private final String author;
	private final Date postDate;

	Post(String subject, String author, Date postDate) {
		this.subject = subject;
		this.author = author;
		this.postDate = postDate;
	}
	
	public String subject() {
		return this.subject;
	}

	public String author() {
		return this.author;
	}

	public Date postDate() {
		return this.postDate;
	}

}
