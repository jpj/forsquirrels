
package com.solairis.forsquirrels.messageboard;

import java.util.ArrayList;
import java.util.List;

public class Thread {
	
	private final List<Post> posts;

	public Thread() {
		this.posts = new ArrayList<>();
	}

	List<Post> posts() {
		return this.posts;
	}

	void addPost(Post post) {
		this.posts.add(post);
	}

}
