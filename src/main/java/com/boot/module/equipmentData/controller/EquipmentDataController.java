package com.boot.module.equipmentData.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.module.equipmentData.bean.EquipmentData;
import com.boot.module.equipmentData.service.EquipmentDataService;
import com.boot.module.equipmentData.vo.EquipmentDataVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags = "数据管理")
@RestController
@RequestMapping("/eeda/v1/equipmentData")
@EnableAutoConfiguration
public class EquipmentDataController {
	
    private static final Logger logger = LoggerFactory.getLogger(EquipmentDataController.class);
    
    @Autowired
    private EquipmentDataService equipmentDataService;
    
    @PostMapping
	@ApiOperation(value = "新增设备数据", notes="新增设备数据 API", produces = "application/json")
	@ApiImplicitParam(name = "equipmentData", value = "设备数据", dataType = "EquipmentData", required = true)
    public Object saveEquipmentData(@RequestBody EquipmentData equipmentData) throws Exception {
    	return equipmentDataService.saveEquipmentData(equipmentData);
    }
    
    @DeleteMapping("/{equipmentDataId}")
    @ApiOperation(value = "删除设备数据", notes="删除设备数据 API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentDataId", value = "设备数据", dataType = "String", paramType = "path")
    public Object delEquipmentData(@PathVariable String equipmentDataId) throws Exception {
    	return equipmentDataService.delEquipmentData(equipmentDataId);
    }
    
    @PutMapping("/{equipmentDataId}")
	@ApiOperation(value = "更新设备数据", notes="更新设备数据 API", produces = "application/json")
	@ApiImplicitParams({ 
    	@ApiImplicitParam(name = "equipmentDataId", value = "设备数据", dataType = "String", paramType = "path") ,
    	@ApiImplicitParam(name = "equipmentData", value = "设备数据", dataType = "EquipmentData", paramType = "body")})
    public Object updateEquipmentData(@PathVariable String equipmentDataId, @RequestBody EquipmentData equipmentData) throws Exception {
    	return equipmentDataService.updateEquipmentData(equipmentDataId, equipmentData);
    }
    
    @GetMapping("/{equipmentDataId}")
    @ApiOperation(value = "查询设备数据", notes="查询设备数据 API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentDataId", value = "设备数据", dataType = "String", paramType = "path")
    public Object getEquipmentData(@PathVariable String equipmentDataId) throws Exception {
    	return equipmentDataService.getEquipmentData(equipmentDataId);
    }
    
    @PostMapping("/queryWithPage")
    @ApiOperation(value = "查询设备数据", notes="查询设备数据 API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentDataVO", value = "设备数据", dataType = "EquipmentDataVO", paramType = "body")
    public Object getEquipmentData(@RequestBody EquipmentDataVO equipmentDataVO) throws Exception {
    	return equipmentDataService.getEquipmentData(equipmentDataVO);
    }
    
    @GetMapping("/list")
    @ApiOperation(value = "查询设备数据", notes="查询设备数据 API", produces = "application/json")
    public Object list() throws Exception {
    	return equipmentDataService.list();
    }
    
}