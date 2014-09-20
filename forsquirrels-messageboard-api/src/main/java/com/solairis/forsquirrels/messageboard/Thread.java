
package com.solairis.forsquirrels.messageboard;

import java.util.ArrayList;
import java.util.List;

public class Thread {

	List<Post> posts() {
		return new ArrayList<Post>() {{
			add(new Post(null, null, null));
		}};
	}

}
