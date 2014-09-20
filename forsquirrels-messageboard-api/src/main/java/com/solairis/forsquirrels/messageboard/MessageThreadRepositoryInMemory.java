
package com.solairis.forsquirrels.messageboard;

import java.util.ArrayList;
import java.util.List;

public class MessageThreadRepositoryInMemory implements MessageThreadRepository {
	
	private final List<MessageThread> threads;

	public MessageThreadRepositoryInMemory() {
		this.threads = new ArrayList<>();
	}

	@Override
	public List<MessageThread> findAllThreads() {
		return this.threads;
	}

	public MessageThread startThread() {
		final MessageThread messageThread = new MessageThread();
		this.threads.add(messageThread);
		return messageThread;
	}

}
