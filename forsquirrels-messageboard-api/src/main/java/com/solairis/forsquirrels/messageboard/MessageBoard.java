
package com.solairis.forsquirrels.messageboard;

import java.util.ArrayList;
import java.util.List;

public class MessageBoard {
	
	private final List<MessageThread> threads;

	public MessageBoard() {
		this.threads = new ArrayList<>();
	}

	public List<MessageThread> findAllThreads() {
		return this.threads;
	}

	public MessageThread startThread() {
		final MessageThread messageThread = new MessageThread();
		this.threads.add(messageThread);
		return messageThread;
	}

}
