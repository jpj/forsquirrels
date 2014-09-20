
package com.solairis.forsquirrels.messageboard;

import java.util.Date;

public class Post {
	
	private final String subject;
	private final String author;
	private final Date postDate;

	public Post(String subject, String author, Date postDate) {
		this.subject = subject;
		this.author = author;
		this.postDate = postDate;
	}
	
	public String getSubject() {
		return this.subject;
	}

	public String getAuthor() {
		return this.author;
	}

	public Date getPostDate() {
		return this.postDate;
	}

}
