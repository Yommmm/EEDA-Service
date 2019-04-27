package com.boot.module.equipmentUserInfo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.boot.module.equipmentUserInfo.bean.EquipmentUserInfo;
import com.boot.module.equipmentUserInfo.repository.EquipmentUserInfoRepository;
import com.boot.module.equipmentUserInfo.vo.EquipmentUserInfoVO;

@Service
public class EquipmentUserInfoService {
	
    private static final Logger logger = LoggerFactory.getLogger(EquipmentUserInfoService.class);
    
    @Autowired
    private EquipmentUserInfoRepository equipmentUserInfoRepository;
    
    /**
   	 * 保存EquipmentUserInfo
   	 * @param equipmentUserInfo
   	 */
    public EquipmentUserInfo saveEquipmentUserInfo(EquipmentUserInfo equipmentUserInfo) throws Exception {
    	equipmentUserInfo = this.equipmentUserInfoRepository.save(equipmentUserInfo);
    	return equipmentUserInfo;
    }
    
    /**
	 * 删
	 * @param equipmentUserInfoId XXXX
	 */
    public String delEquipmentUserInfo(String equipmentUserInfoId) throws Exception {
    	this.equipmentUserInfoRepository.deleteById(equipmentUserInfoId);
    	return equipmentUserInfoId;
    }
    
    /**
	 * 修改EquipmentUserInfo
	 * @param equipmentUserInfo XXXX
	 */
    public EquipmentUserInfo updateEquipmentUserInfo(String equipmentUserInfoId, EquipmentUserInfo equipmentUserInfo) throws Exception {
    	return equipmentUserInfo;
    }
    
    /**
	 * 通过equipmentUserInfoID查询EquipmentUserInfo
	 * @param equipmentUserInfoId XXXX
	 */
    public EquipmentUserInfoVO getEquipmentUserInfo(String equipmentUserInfoId) throws Exception {
    	EquipmentUserInfo equipmentUserInfo = this.equipmentUserInfoRepository.getOne(equipmentUserInfoId);
    	EquipmentUserInfoVO equipmentUserInfoVO = new EquipmentUserInfoVO();
    	
    	BeanUtils.copyProperties(equipmentUserInfo, equipmentUserInfoVO);
    	this.translate(equipmentUserInfoVO);
    	
    	return equipmentUserInfoVO;
    }
    
    /**
	 * 查
	 * @param equipmentUserInfo XXXX
	 */
    public Page<EquipmentUserInfoVO> getEquipmentUserInfo(EquipmentUserInfoVO conditions) throws Exception {
    	return null;
    }
    
    private void translate(EquipmentUserInfoVO equipmentUserInfoVO) {
    	// TODO
    }
    
    
}


