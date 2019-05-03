package com.boot.module.cmd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.module.cmd.vo.CommandVO;
import com.boot.module.equipmentInfo.bean.EquipmentInfo;
import com.boot.module.equipmentInfo.repository.EquipmentInfoRepository;
import com.boot.module.equipmentInfo.service.EquipmentInfoService;

@Service
public class CmdService {
	
	@Autowired
	private EquipmentInfoRepository equipmentInfoRepository;

	@Autowired
	private EquipmentInfoService equipmentInfoService;
	
	public String getCommand(String eMac) {
		return this.equipmentInfoService.getCommandByMac(eMac);
	}
	
	@Transactional
	public EquipmentInfo setCommand(CommandVO commandVO) {
		EquipmentInfo equipmentInfo = equipmentInfoRepository.findByEMac(commandVO.geteMac());
		equipmentInfo.seteCmd(commandVO.getCommand());
		equipmentInfo.seteCount(0);
		
		equipmentInfo = equipmentInfoRepository.save(equipmentInfo);
		return equipmentInfo;
	}
	
	@Transactional
	public void setAllCommand(String command) {
		equipmentInfoRepository.updateAllCmd(command);
	}
	
}
