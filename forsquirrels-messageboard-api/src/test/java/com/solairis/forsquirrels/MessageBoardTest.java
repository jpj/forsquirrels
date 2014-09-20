
package com.solairis.forsquirrels;

import java.util.List;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageBoardTest {
	
	private MessageBoard target;
	
	@Before
	public void setup_before_each_test() {
		this.target = new MessageBoard();
	}
	
	@Test
	public void show_list_of_posts() {
		List<Post> posts = this.target.findAllPosts();
		Assert.assertThat(posts.isEmpty(), CoreMatchers.is(false));
	}

}
