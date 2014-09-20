
package com.solairis.forsquirrels.messageboard.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "FS_MB_POSTS")
public class Post implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PARENT")
	private MsgThread parentThread;
	
	@Column(name = "DATE")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date createDate;
	
	@Column(name = "NAME")
	private String author;
	
	@Column(name = "SUBJECT")
	private String subject;
	
	@Column(name = "BODY")
	private String body;
	
	@Column(name = "LISTEN")
	private String currentlyListeningTo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MsgThread getParentThread() {
		return parentThread;
	}

	public void setParentThread(MsgThread parentThread) {
		this.parentThread = parentThread;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCurrentlyListeningTo() {
		return currentlyListeningTo;
	}

	public void setCurrentlyListeningTo(String currentlyListeningTo) {
		this.currentlyListeningTo = currentlyListeningTo;
	}

}
