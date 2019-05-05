package com.boot.module.equipmentData.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.boot.module.equipmentData.bean.EquipmentData;
import com.boot.module.equipmentData.repository.EquipmentDataRepository;
import com.boot.module.equipmentData.vo.EquipmentDataVO;

@Service
public class EquipmentDataService {
	
    private static final Logger logger = LoggerFactory.getLogger(EquipmentDataService.class);
    
    @Autowired
    private EquipmentDataRepository equipmentDataRepository;
    
    /**
   	 * 保存EquipmentData
   	 * @param equipmentData
   	 */
    public EquipmentData saveEquipmentData(EquipmentData equipmentData) throws Exception {
    	equipmentData.setCreateTime(new Date());
    	equipmentData = this.equipmentDataRepository.save(equipmentData);
    	return equipmentData;
    }
    
    /**
	 * 删
	 * @param equipmentDataId XXXX
	 */
    public String delEquipmentData(String equipmentDataId) throws Exception {
    	this.equipmentDataRepository.deleteById(equipmentDataId);
    	return equipmentDataId;
    }
    
    /**
	 * 修改EquipmentData
	 * @param equipmentData XXXX
	 */
    public EquipmentData updateEquipmentData(String equipmentDataId, EquipmentData equipmentData) throws Exception {
    	return equipmentData;
    }
    
    /**
	 * 通过equipmentDataID查询EquipmentData
	 * @param equipmentDataId XXXX
	 */
    public EquipmentData getEquipmentData(String eMac) throws Exception {
    	EquipmentData equipmentData = equipmentDataRepository.findLast(eMac);
    			
    	return equipmentData;
    }
    
    /**
	 * 查
	 * @param equipmentData XXXX
	 */
    public Page<EquipmentDataVO> getEquipmentData(EquipmentDataVO conditions) throws Exception {
    
    	return null;
    }
    
    private void translate(EquipmentDataVO equipmentDataVO) {
    	// TODO
    }
    
    public List<EquipmentData> list() {
    	return equipmentDataRepository.findEdDesc();
    }
    
    
}


