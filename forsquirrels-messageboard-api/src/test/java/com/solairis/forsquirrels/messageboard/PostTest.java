
package com.solairis.forsquirrels.messageboard;

import java.util.Date;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class PostTest {
	
	private static final String AUTHOR = "Henry";
	private static final String SUBJECT = "First Subject";
	private static final Date POST_DATE = new Date();
	
	private Post target;
	
	@Before
	public void before_each_test() {
		this.target = new Post(SUBJECT, AUTHOR, POST_DATE);
	}

	@Test
	public void post_has_subject() {
		assertThat(this.target.getSubject(), is(SUBJECT));
	}
	
	@Test
	public void post_has_author() {
		String author = this.target.getAuthor();
		assertThat(author, is(AUTHOR));
	}
	
	@Test
	public void post_has_post_date() {
		Date postDate = this.target.getPostDate();
		assertThat(postDate, is(POST_DATE));
	}
}
