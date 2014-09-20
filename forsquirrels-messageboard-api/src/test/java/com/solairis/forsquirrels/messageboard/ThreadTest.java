
package com.solairis.forsquirrels.messageboard;

import java.util.List;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class ThreadTest {
	
	
	@Test
	public void find_all_posts_in_thread() {
		Thread thread = new Thread();
		List<Post> posts = thread.posts();
		Assert.assertThat(posts.isEmpty(), CoreMatchers.is(false));
	}

}
