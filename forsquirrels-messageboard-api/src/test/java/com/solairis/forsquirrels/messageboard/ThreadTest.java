
package com.solairis.forsquirrels.messageboard;

import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class ThreadTest {
	
	private Thread target;
	
	@Before
	public void before_each_test() {
		this.target = new Thread();
	}
	
	@Test
	public void right_off_the_bat_the_list_of_posts_will_be_empty() {
		assertThat(target.posts().isEmpty(), is(true));
	}
	
	@Test
	public void can_add_Post_to_Thread() {
		this.target.addPost(new Post(null, null, null));
		assertThat(target.posts().size(), is(1));
	}

}
