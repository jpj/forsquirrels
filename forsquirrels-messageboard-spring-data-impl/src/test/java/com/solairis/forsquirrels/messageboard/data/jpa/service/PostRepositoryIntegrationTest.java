
package com.solairis.forsquirrels.messageboard.data.jpa.service;

import com.solairis.forsquirrels.messageboard.data.jpa.ApplicationRunner;
import com.solairis.forsquirrels.messageboard.data.jpa.domain.MsgThread;
import com.solairis.forsquirrels.messageboard.data.jpa.domain.Post;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationRunner.class)
public class PostRepositoryIntegrationTest {
	
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private MsgThreadRepository msgThreadRepository;
	
	@Test
	public void tests_work() {
		assertThat(true, is(true));
	}
	
	@Test
	public void should_be_one_post() {
		List<Post> posts = this.postRepository.findAll();
		assertThat(posts.size(), is(1));
	}
	
	@Test
	public void first_thread_should_have_one_Post() {
		
		List<MsgThread> msgThreads = this.msgThreadRepository.findAll();
		
		List<Post> posts = this.postRepository.findAllByParentThread(msgThreads.get(0));
		assertThat(posts.size(), is(1));
	}

}
