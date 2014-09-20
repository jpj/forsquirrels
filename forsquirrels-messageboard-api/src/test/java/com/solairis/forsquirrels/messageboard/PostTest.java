
package com.solairis.forsquirrels.messageboard;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class PostTest {
	
	private static final String AUTHOR = "Henry";
	private static final String SUBJECT = "First Subject";
	
	private Post target;
	
	@Before
	public void before_each_test() {
		this.target = new Post(SUBJECT, AUTHOR);
	}

	@Test
	public void post_has_subject() {
		assertThat(this.target.subject(), is(SUBJECT));
	}
	
	@Test
	public void post_has_author() {
		String author = this.target.author();
		assertThat(author, is(AUTHOR));
	}
}
