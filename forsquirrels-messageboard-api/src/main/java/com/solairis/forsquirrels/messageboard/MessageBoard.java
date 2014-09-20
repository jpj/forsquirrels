
package com.solairis.forsquirrels.messageboard;

import com.solairis.forsquirrels.messageboard.Post;
import java.util.ArrayList;
import java.util.List;

class MessageBoard {

	List<Post> findAllThreads() {
		
		return new ArrayList<Post>() {{
			add(new Post(null, null));
			add(new Post(null, null));
		}};
	}

}
