package com.boot.module.equipmentUserInfo.controller;

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

import com.boot.module.equipmentUserInfo.bean.EquipmentUserInfo;
import com.boot.module.equipmentUserInfo.service.EquipmentUserInfoService;
import com.boot.module.equipmentUserInfo.vo.EquipmentUserInfoVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value = "员工API")
@RestController
@RequestMapping("/wms/v1/equipmentUserInfo")
@EnableAutoConfiguration
public class EquipmentUserInfoController {
// public class EquipmentUserInfoController extends QueryAndOperateCtrl<EquipmentUserInfo, EquipmentUserInfoService> {
	
    private static final Logger logger = LoggerFactory.getLogger(EquipmentUserInfoController.class);
    
    @Autowired
    private EquipmentUserInfoService equipmentUserInfoService;
    
    /**
	 * 增
	 * @param equipmentUserInfo XXXX
	 */
    @PostMapping("/save")
	@ApiOperation(value = "新增 TODO description", notes="新增 TODO description API", produces = "application/json")
	@ApiImplicitParam(name = "equipmentUserInfo", value = "TODO description", dataType = "EquipmentUserInfo", required = true)
    public Object saveEquipmentUserInfo(@RequestBody EquipmentUserInfo equipmentUserInfo) throws Exception {
    	return equipmentUserInfoService.saveEquipmentUserInfo(equipmentUserInfo);
    }
    
    /**
	 * 删
	 * @param equipmentUserInfoId XXXX
	 */
    @DeleteMapping("/{equipmentUserInfoId}")
    @ApiOperation(value = "删除 TODO description", notes="删除 TODO description API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentUserInfoId", value = "TODO description", dataType = "String", paramType = "path")
    public Object delEquipmentUserInfo(@PathVariable String equipmentUserInfoId) throws Exception {
    	return equipmentUserInfoService.delEquipmentUserInfo(equipmentUserInfoId);
    }
    
    /**
	 * 改
	 * @param equipmentUserInfoId XXXX
	 * @param equipmentUserInfo XXXX
	 */
    @PutMapping("/{equipmentUserInfoId}")
	@ApiOperation(value = "更新 TODO description", notes="更新 TODO description API", produces = "application/json")
	@ApiImplicitParams({ 
    	@ApiImplicitParam(name = "equipmentUserInfoId", value = "TODO description", dataType = "String", paramType = "path") ,
    	@ApiImplicitParam(name = "equipmentUserInfo", value = "TODO description", dataType = "EquipmentUserInfo", paramType = "body")})
    public Object updateEquipmentUserInfo(@PathVariable String equipmentUserInfoId, @RequestBody EquipmentUserInfo equipmentUserInfo) throws Exception {
    	return equipmentUserInfoService.updateEquipmentUserInfo(equipmentUserInfoId, equipmentUserInfo);
    }
    
    /**
	 * 查
	 * @param equipmentUserInfoId XXXX
	 */
    @GetMapping("/{equipmentUserInfoId}")
    @ApiOperation(value = "查询 TODO description", notes="查询 TODO description API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentUserInfoId", value = "TODO description", dataType = "String", paramType = "path")
    public Object getEquipmentUserInfo(@PathVariable String equipmentUserInfoId) throws Exception {
    	return equipmentUserInfoService.getEquipmentUserInfo(equipmentUserInfoId);
    }
    
    /**
	 * 查
	 * @param equipmentUserInfo XXXX
	 */
    @PostMapping("/queryWithPage")
    @ApiOperation(value = "查询 TODO description", notes="查询 TODO description API", produces = "application/json")
    @ApiImplicitParam(name = "equipmentUserInfoVO", value = "TODO description", dataType = "EquipmentUserInfoVO", paramType = "body")
    public Object getEquipmentUserInfo(@RequestBody EquipmentUserInfoVO equipmentUserInfoVO) throws Exception {
    	return equipmentUserInfoService.getEquipmentUserInfo(equipmentUserInfoVO);
    }
    
}