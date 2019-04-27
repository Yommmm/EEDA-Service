package com.boot.module.equipmentUserInfo.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "equipment_user_info")
@ApiModel(value = "EquipmentUserInfo", description = "TODO")
public class EquipmentUserInfo {
    
	/**
	 * 用户流水号
	 */
	@Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "user_id")
    @ApiModelProperty(value = "用户流水号")
	private String userId;
	
	/**
	 * 用户账号
	 */
    @Column(name = "user_name")
    @ApiModelProperty(value = "用户账号")
	private String userName;
	
	/**
	 * 用户密码
	 */
    @Column(name = "user_password")
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