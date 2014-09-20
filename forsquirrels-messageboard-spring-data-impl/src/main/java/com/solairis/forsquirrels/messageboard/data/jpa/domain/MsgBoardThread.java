
package com.solairis.forsquirrels.messageboard.data.jpa.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity(name = "FS_MB_THREADS")
public class MsgBoardThread implements Serializable {
	
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "`DATE`")
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date creationDate;

}
