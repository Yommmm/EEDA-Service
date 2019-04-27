package com.boot.module.equipmentInfo.controller;

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

import com.boot.module.equipmentInfo.bean.EquipmentInfo;
import com.boot.module.equipmentInfo.service.EquipmentInfoService;
import com.boot.module.equipmentInfo.vo.EquipmentInfoVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags = "设备信息管理")
@RestController
@RequestMapping("/eeda/v1/equipmentInfo")
@EnableAutoConfiguration
public class EquipmentInfoController {
	
    private static final Logger logger = LoggerFactory.getLogger(EquipmentInfoController.class);
    
    @Autowired
    private EquipmentInfoService equipmentInfoService;
    
    /**
	 * 增
	 * @param equipmentInfo XXXX
	 */
    @PostMapping
	@ApiOperation(value = "新增设备信息", notes="新增设备信息 API", produces = "application/json")
	@ApiImplicitParam(name = "equipmentInfo", value = "设备信息", dataType = "EquipmentInfo", required = true)
    public Object saveEquipmentInfo(@RequestBody EquipmentInfo equipmentInfo) throws Exception {
    	return equipmentInfoService.saveEquipmentInfo(equipmentInfo);
    }
    
    /**
	 * 删
	 * @param equipmentInfoId XXXX
	 */
    @DeleteMapping("/{equipmentInfoId}")
    @ApiOperation(value = "删除设备信息", notes="删除设备信息 API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentInfoId", value = "设备信息", dataType = "String", paramType = "path")
    public Object delEquipmentInfo(@PathVariable String equipmentInfoId) throws Exception {
    	return equipmentInfoService.delEquipmentInfo(equipmentInfoId);
    }
    
    /**
	 * 改
	 * @param equipmentInfoId XXXX
	 * @param equipmentInfo XXXX
	 */
    @PutMapping("/{equipmentInfoId}")
	@ApiOperation(value = "更新设备信息", notes="更新设备信息 API", produces = "application/json")
	@ApiImplicitParams({ 
    	@ApiImplicitParam(name = "equipmentInfoId", value = "设备信息", dataType = "String", paramType = "path") ,
    	@ApiImplicitParam(name = "equipmentInfo", value = "设备信息", dataType = "EquipmentInfo", paramType = "body")})
    public Object updateEquipmentInfo(@PathVariable String equipmentInfoId, @RequestBody EquipmentInfo equipmentInfo) throws Exception {
    	return equipmentInfoService.updateEquipmentInfo(equipmentInfoId, equipmentInfo);
    }
    
    /**
	 * 查
	 * @param equipmentInfoId XXXX
	 */
    @GetMapping("/{equipmentInfoId}")
    @ApiOperation(value = "查询设备信息", notes="查询设备信息 API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentInfoId", value = "设备信息", dataType = "String", paramType = "path")
    public Object getEquipmentInfo(@PathVariable String equipmentInfoId) throws Exception {
    	return equipmentInfoService.getEquipmentInfo(equipmentInfoId);
    }
    
    /**
	 * 查
	 * @param equipmentInfo XXXX
	 */
    @PostMapping("/queryWithPage")
    @ApiOperation(value = "查询设备信息", notes="查询设备信息 API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentInfoVO", value = "设备信息", dataType = "EquipmentInfoVO", paramType = "body")
    public Object getEquipmentInfo(@RequestBody EquipmentInfoVO equipmentInfoVO) throws Exception {
    	return equipmentInfoService.getEquipmentInfo(equipmentInfoVO);
    }
    
}