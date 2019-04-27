package com.boot.module.cmd.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "控制命令管理")
@RestController
@RequestMapping(value = "/eeda/v1/cmd")
public class CmdController {

	private static final Logger logger = LoggerFactory.getLogger(CmdController.class);
	
	private String command = "command";
	
	private List<Object> list = new ArrayList<>();
	
	@GetMapping("/heatbeat")
	@ApiOperation(value = "心跳获取控制命令", notes="心跳获取控制命令API", produces = "application/json")
	public String getCommand() {
		logger.info("正在获取控制命令！");
		return this.command;
	}
	
	@PostMapping("/command")
	@ApiOperation(value = "修改控制命令", notes="修改控制命令API", produces = "application/json")
	public String setCommand(String command) {
		logger.info("正在修改控制命令为： {}", command);
		return this.command = command;
	}
	
	@PostMapping("/message")
	@ApiOperation(value = "设备发送消息到数据仓库接口", notes="设备发送消息到数据仓库API", produces = "application/json")
	public String sendMessage(@RequestBody Map<String, Object> params) {
		list.add(params);
		logger.info("正在传输设备数据： {}", JSONObject.toJSONString(params));
		return "sucess";
	}
	
	@GetMapping("/message")
	@ApiOperation(value = "获取数据仓库所有数据的接口", notes="获取数据仓库所有数据 API", produces = "application/json")
	public String getMessage() {
		logger.info("正在传输设备数据： {}", JSONObject.toJSONString(this.list));
		return JSONObject.toJSONString(this.list);
	}
	
}
