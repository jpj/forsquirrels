
package com.solairis.forsquirrels.messageboard;

import java.util.ArrayList;
import java.util.List;

public class MessageBoard {

	public List<Post> findAllThreads() {
		
		return new ArrayList<Post>() {{
			add(new Post(null, null, null));
			add(new Post(null, null, null));
		}};
	}

}
