
package com.solairis.forsquirrels;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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
		assertThat(posts.isEmpty(), is(false));
	}

}
