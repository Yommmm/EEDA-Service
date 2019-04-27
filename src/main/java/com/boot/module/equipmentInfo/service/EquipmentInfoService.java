package com.boot.module.equipmentInfo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.boot.module.equipmentInfo.bean.EquipmentInfo;
import com.boot.module.equipmentInfo.repository.EquipmentInfoRepository;
import com.boot.module.equipmentInfo.vo.EquipmentInfoVO;

@Service
public class EquipmentInfoService {
	
    private static final Logger logger = LoggerFactory.getLogger(EquipmentInfoService.class);
    
    @Autowired
    private EquipmentInfoRepository equipmentInfoRepository;
    
    /**
   	 * 保存EquipmentInfo
   	 * @param equipmentInfo
   	 */
    public EquipmentInfo saveEquipmentInfo(EquipmentInfo equipmentInfo) throws Exception {
    	equipmentInfo = this.equipmentInfoRepository.save(equipmentInfo);
    	return equipmentInfo;
    }
    
    /**
	 * 删
	 * @param equipmentInfoId XXXX
	 */
    public String delEquipmentInfo(String equipmentInfoId) throws Exception {
    	this.equipmentInfoRepository.deleteById(equipmentInfoId);
    	return equipmentInfoId;
    }
    
    /**
	 * 修改EquipmentInfo
	 * @param equipmentInfo XXXX
	 */
    public EquipmentInfo updateEquipmentInfo(String equipmentInfoId, EquipmentInfo equipmentInfo) throws Exception {
    	return equipmentInfo;
    }
    
    /**
	 * 通过equipmentInfoID查询EquipmentInfo
	 * @param equipmentInfoId XXXX
	 */
    public EquipmentInfoVO getEquipmentInfo(String equipmentInfoId) throws Exception {
    	EquipmentInfo equipmentInfo = this.equipmentInfoRepository.getOne(equipmentInfoId);
    	EquipmentInfoVO equipmentInfoVO = new EquipmentInfoVO();
    	
    	BeanUtils.copyProperties(equipmentInfo, equipmentInfoVO);
    	this.translate(equipmentInfoVO);
    	
    	return equipmentInfoVO;
    }
    
    /**
	 * 查
	 * @param equipmentInfo XXXX
	 */
    public Page<EquipmentInfoVO> getEquipmentInfo(EquipmentInfoVO conditions) throws Exception {
    	return null;
    }
    
    private void translate(EquipmentInfoVO equipmentInfoVO) {
    	// TODO
    }
    
    
}


