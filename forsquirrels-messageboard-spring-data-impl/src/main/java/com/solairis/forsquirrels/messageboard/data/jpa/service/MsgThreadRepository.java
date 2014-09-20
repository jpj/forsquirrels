
package com.solairis.forsquirrels.messageboard.data.jpa.service;

import com.solairis.forsquirrels.messageboard.data.jpa.domain.MsgThread;
import java.util.List;
import org.springframework.data.repository.Repository;

public interface MsgThreadRepository extends Repository<MsgThread, Long>{
	
	List<MsgThread> findAll();

}
