
package com.solairis.forsquirrels.messageboard;

import com.solairis.forsquirrels.messageboard.MessageThread;
import com.solairis.forsquirrels.messageboard.MessageThreadRepository;
import com.solairis.forsquirrels.messageboard.MessageThreadRepositoryInMemory;
import com.solairis.forsquirrels.messageboard.Post;
import com.solairis.forsquirrels.messageboard.data.jpa.domain.MsgThread;
import com.solairis.forsquirrels.messageboard.data.jpa.service.MsgThreadRepository;
import com.solairis.forsquirrels.messageboard.data.jpa.service.PostRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	
	@Autowired
	private MsgThreadRepository msgThreadRepository;
	@Autowired
	private PostRepository postRepository;
	
//	@Bean
//	public MessageThreadRepository messageBoard() {
//		final MessageThreadRepositoryInMemory messageBoard = new MessageThreadRepositoryInMemory();
//		
//		messageBoard.startThread()
//			.addPost(new Post("Getting in Contact", "Majorlabelland", new Date()))
//			.addPost(new Post(" Re: Getting in Contact", "guest", new Date()));
//		
//		messageBoard.startThread()
//			.addPost(new Post("I miss Bill", "M.G.", new Date()))
//			.addPost(new Post("Re: I miss Bill", "guest", new Date()))
//			.addPost(new Post("Re: Style Boy", "Mullaney", new Date()))
//			.addPost(new Post("Re: I miss Bill", "guest", new Date()));
//		
//		return messageBoard;
//	}
	
	@Bean
	public MessageThreadRepository messageThreadRepository() {
		return new MessageThreadRepository() {

			@Override
			public List<MessageThread> findAllThreads() {
				List<MessageThread> threads = new ArrayList<MessageThread>();
				
				List<MsgThread> msgThreads = msgThreadRepository.findAll();
				
				for (MsgThread msgThread : msgThreads) {
					final MessageThread messageThread = new MessageThread();
					List<com.solairis.forsquirrels.messageboard.data.jpa.domain.Post> posts = postRepository.findAllByParentThread(msgThread);
					for (com.solairis.forsquirrels.messageboard.data.jpa.domain.Post post : posts) {
						messageThread.addPost(new Post(post.getSubject(), post.getAuthor(), post.getCreateDate()));
					}
					threads.add(messageThread);
				}
				
				return threads;
			}
		};
	}

}
