
package com.solairis.forsquirrels.messageboard.data.jpa.service;

import com.solairis.forsquirrels.messageboard.data.jpa.ApplicationRunner;
import com.solairis.forsquirrels.messageboard.data.jpa.domain.MsgThread;
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
public class MsgThreadIntegrationTest {
	
	@Autowired
	private MsgThreadRepository msgThreadRepository;
	
	@Test
	public void verify_test() {
		assertThat(true, is(true));
	}
	
	@Test
	public void should_be_one_thread_in_db() {
		List<MsgThread> threads = this.msgThreadRepository.findAll();
		assertThat(threads.size(), is(1));
	}

}
