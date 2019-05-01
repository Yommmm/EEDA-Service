package com.boot.module.equipmentInfo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public EquipmentInfo saveEquipmentInfo(EquipmentInfo equipmentInfo) throws Exception {
    	EquipmentInfo findByEMac = equipmentInfoRepository.findByEMac(equipmentInfo.geteMac());
    	if(null != findByEMac) {
    		throw new IllegalArgumentException(equipmentInfo.geteMac());
    	}
    	equipmentInfo = this.equipmentInfoRepository.save(equipmentInfo);
    	return equipmentInfo;
    }
    
    /**
	 * 删
	 * @param equipmentInfoId XXXX
	 */
    @Transactional
    public String delEquipmentInfo(String equipmentInfoId) throws Exception {
    	this.equipmentInfoRepository.deleteById(equipmentInfoId);
    	return equipmentInfoId;
    }
    
    /**
	 * 修改EquipmentInfo
	 * @param equipmentInfo XXXX
	 */
    @Transactional
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
    public Page<EquipmentInfo> getEquipmentInfo(EquipmentInfoVO conditions) throws Exception {
    	Pageable pageable = PageRequest.of(conditions.getPageNum(), conditions.getPageSize());
    	Page<EquipmentInfo> findAll = equipmentInfoRepository.findAll(pageable);
    	return findAll;
    }
    
    private void translate(EquipmentInfoVO equipmentInfoVO) {
    	// TODO
    }
    
    public String getCommandByMac(String eMac) {
    	EquipmentInfo equipmentInfo = equipmentInfoRepository.findByEMac(eMac);
    	return equipmentInfo.geteCmd();
    }
    
}


