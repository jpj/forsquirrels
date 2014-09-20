
package com.solairis.forsquirrels;

import java.util.ArrayList;
import java.util.List;

class MessageBoard {

	List<Post> findAllPosts() {
		
		return new ArrayList<Post>() {{
			add(new Post());
			add(new Post());
		}};
	}

}
