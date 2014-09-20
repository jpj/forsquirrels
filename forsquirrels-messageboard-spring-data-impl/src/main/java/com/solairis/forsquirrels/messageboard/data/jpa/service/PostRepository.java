
package com.solairis.forsquirrels.messageboard.data.jpa.service;

import com.solairis.forsquirrels.messageboard.data.jpa.domain.MsgThread;
import com.solairis.forsquirrels.messageboard.data.jpa.domain.Post;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface PostRepository extends Repository<Post, Long> {
	
	List<Post> findAll();
	List<Post> findAllByParentThread(MsgThread parentThread);

}
