package com.boot.module.equipmentUserInfo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "EquipmentUserInfoVO", description = "TODO")
public class EquipmentUserInfoVO {
    
    /**
	 * 用户流水号
	 */
	@ApiModelProperty(value = "用户流水号")
	private String userId;
	
    /**
	 * 用户账号
	 */
	@ApiModelProperty(value = "用户账号")
	private String userName;
	
    /**
	 * 用户密码
	 */
	@ApiModelProperty(value = "用户密码")
	private String userPassword;
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return this.userId;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserPassword() {
		return this.userPassword;
	}
	
	
}