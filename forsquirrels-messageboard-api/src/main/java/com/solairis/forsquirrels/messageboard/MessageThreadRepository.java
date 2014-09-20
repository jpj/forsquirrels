
package com.solairis.forsquirrels.messageboard;

import java.util.List;

public interface MessageThreadRepository {

	List<MessageThread> findAllThreads();

}
