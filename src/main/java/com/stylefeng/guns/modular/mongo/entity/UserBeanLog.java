package com.stylefeng.guns.modular.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by Eden on 2017/10/14.
 */
@Document(collection = "beanLog")
public class UserBeanLog implements Serializable {

	@Id
	private String id;

	private int uid;

	private String username;

	private int beanAmount;//操作数量

	private int beforeAmount;//操作前数量

	private int afterAmount;//操作后数量

	private int opType;//入?出

	private int opCode;//6大类型

	private String remark;//备注

	private String operatorUser;//操作人

	private String ipAddr;

	private String createTime;//操作时间

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getBeanAmount() {
		return beanAmount;
	}

	public void setBeanAmount(int beanAmount) {
		this.beanAmount = beanAmount;
	}

	public int getBeforeAmount() {
		return beforeAmount;
	}

	public void setBeforeAmount(int beforeAmount) {
		this.beforeAmount = beforeAmount;
	}

	public int getAfterAmount() {
		return afterAmount;
	}

	public void setAfterAmount(int afterAmount) {
		this.afterAmount = afterAmount;
	}

	public int getOpType() {
		return opType;
	}

	public void setOpType(int opType) {
		this.opType = opType;
	}

	public int getOpCode() {
		return opCode;
	}

	public void setOpCode(int opCode) {
		this.opCode = opCode;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getOperatorUser() {
		return operatorUser;
	}

	public void setOperatorUser(String operatorUser) {
		this.operatorUser = operatorUser;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
}
