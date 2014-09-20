
package com.solairis.forsquirrels.messageboard;

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
		List<MessageThread> threads = this.target.findAllThreads();
		assertThat(threads.isEmpty(), is(true));
	}
	
	@Test
	public void starting_a_message_thread_adds_one_thread() {
		MessageThread thread = this.target.startThread();
		assertThat(this.target.findAllThreads().size(), is(1));
	}

}
