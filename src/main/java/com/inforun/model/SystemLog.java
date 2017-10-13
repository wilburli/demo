package com.inforun.model;


import java.util.Date;

/**
 * 系统日志
 * @author WangWei
 *
 */
public class SystemLog implements java.io.Serializable{
	private Integer id;
	private Integer logType;//类型
	private Date logTime;//日志时间
	private String logUser;//操作人
	private String logOperation;//具体操作
	private String logSystem;//操作系统
	private String log;//日志内容
	private String memo;//备注
	private String bankName;//登录机构
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLogType() {
		return logType;
	}
	public void setLogType(Integer logType) {
		this.logType = logType;
	}
	public Date getLogTime() {
		return logTime;
	}
	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}
	public String getLogUser() {
		return logUser;
	}
	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}
	public String getLogOperation() {
		return logOperation;
	}
	public void setLogOperation(String logOperation) {
		this.logOperation = logOperation;
	}
	public String getLogSystem() {
		return logSystem;
	}
	public void setLogSystem(String logSystem) {
		this.logSystem = logSystem;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	
}
