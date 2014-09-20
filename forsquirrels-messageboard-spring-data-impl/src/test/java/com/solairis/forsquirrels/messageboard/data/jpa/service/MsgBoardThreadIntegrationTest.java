
package com.solairis.forsquirrels.messageboard.data.jpa.service;

import com.solairis.forsquirrels.messageboard.data.jpa.ApplicationRunner;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ApplicationRunner.class)
public class MsgBoardThreadIntegrationTest {
	
	@Test
	public void verify_test() {
		assertThat(true, is(true));
	}

}
