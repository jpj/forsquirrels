
package com.solairis.forsquirrels.messageboard;

import java.util.ArrayList;
import java.util.List;

public class MessageThread {
	
	private final List<Post> posts;

	public MessageThread() {
		this.posts = new ArrayList<>();
	}

	public List<Post> getPosts() {
		return this.posts;
	}

	public MessageThread addPost(Post post) {
		this.posts.add(post);
		return this;
	}

}
