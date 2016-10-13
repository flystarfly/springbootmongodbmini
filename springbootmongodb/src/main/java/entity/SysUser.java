package entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SysUser  {
	
	 @Id
	private long seqid;
	
	private String name;

	private String password;
	
	private long roleId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public long getSeqid() {
		return seqid;
	}

	public void setSeqid(long seqid) {
		this.seqid = seqid;
	}

	

	

	

}
