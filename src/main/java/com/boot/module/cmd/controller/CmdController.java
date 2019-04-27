package com.boot.module.cmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.module.cmd.CmdService;
import com.boot.module.cmd.vo.CommandVO;
import com.boot.module.equipmentInfo.bean.EquipmentInfo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "控制命令管理")
@RestController
@RequestMapping(value = "/eeda/v1/cmd")
public class CmdController {
	
	@Autowired
	private CmdService cmdService;

	@GetMapping("/heatbeat/{eMac}")
	@ApiOperation(value = "心跳获取控制命令", notes="心跳获取控制命令API", produces = "application/json")
	public String getCommand(@PathVariable String eMac) {
		return this.cmdService.getCommand(eMac);
	}
	
	@PostMapping("/command")
	@ApiOperation(value = "修改控制命令", notes="修改控制命令API", produces = "application/json")
	public String setCommand(@RequestBody CommandVO commandVO) {
		this.cmdService.setCommand(commandVO);
		return "success";
	}
	
	@PostMapping("/command/all/{command}")
	@ApiOperation(value = "修改全部控制命令", notes="修改全部控制命令API", produces = "application/json")
	public String setAllCommand(@PathVariable String command) {
		this.cmdService.setAllCommand(command);;
		return "success";
	}
	
}
