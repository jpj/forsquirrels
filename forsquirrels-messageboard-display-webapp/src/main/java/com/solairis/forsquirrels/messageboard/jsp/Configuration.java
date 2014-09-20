
package com.solairis.forsquirrels.messageboard.jsp;

import com.solairis.forsquirrels.messageboard.MessageThreadRepositoryInMemory;
import com.solairis.forsquirrels.messageboard.Post;
import java.util.Date;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Bean
	public MessageThreadRepositoryInMemory messageBoard() {
		final MessageThreadRepositoryInMemory messageBoard = new MessageThreadRepositoryInMemory();
		
		messageBoard.startThread()
			.addPost(new Post("Getting in Contact", "Majorlabelland", new Date()))
			.addPost(new Post(" Re: Getting in Contact", "guest", new Date()));
		
		messageBoard.startThread()
			.addPost(new Post("I miss Bill", "M.G.", new Date()))
			.addPost(new Post("Re: I miss Bill", "guest", new Date()))
			.addPost(new Post("Re: Style Boy", "Mullaney", new Date()))
			.addPost(new Post("Re: I miss Bill", "guest", new Date()));
		
		return messageBoard;
	}

}
