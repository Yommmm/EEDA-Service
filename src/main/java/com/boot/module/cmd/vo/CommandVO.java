package com.boot.module.cmd.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "CommandVO", description = "修改设备控制命令用的VO")
public class CommandVO {

	@ApiModelProperty(value = "设备MAC地址")
	private String eMac;
	
	@ApiModelProperty(value = "控制命令")
	private String command;

	public String geteMac() {
		return eMac;
	}

	public void seteMac(String eMac) {
		this.eMac = eMac;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
}
