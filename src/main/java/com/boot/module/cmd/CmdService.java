package com.boot.module.cmd;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.module.cmd.vo.CommandVO;
import com.boot.module.equipmentInfo.bean.EquipmentInfo;
import com.boot.module.equipmentInfo.bean.OperateLog;
import com.boot.module.equipmentInfo.repository.EquipmentInfoRepository;
import com.boot.module.equipmentInfo.repository.OperateLogRepository;
import com.boot.module.equipmentInfo.service.EquipmentInfoService;

@Service
public class CmdService {
	
	@Autowired
	private EquipmentInfoRepository equipmentInfoRepository;

	@Autowired
	private EquipmentInfoService equipmentInfoService;
	
	@Autowired
    private OperateLogRepository operateLogRepository;
	
	public String getCommand(String eMac) {
		return this.equipmentInfoService.getCommandByMac(eMac);
	}
	
	@Transactional
	public EquipmentInfo setCommand(CommandVO commandVO) {
		EquipmentInfo equipmentInfo = equipmentInfoRepository.findByEMac(commandVO.geteMac());
		equipmentInfo.seteCmd(commandVO.getCommand());
		equipmentInfo.seteCount(0);
		
		equipmentInfo = equipmentInfoRepository.save(equipmentInfo);
		
		OperateLog operateLog = new OperateLog();
    	operateLog.setCreateTime(new Date());
    	operateLog.seteCmd(equipmentInfo.geteCmd());
    	operateLog.seteId(equipmentInfo.geteId());
    	operateLogRepository.save(operateLog);
		
		return equipmentInfo;
	}
	
	@Transactional
	public void setAllCommand(String command) {
		equipmentInfoRepository.updateAllCmd(command);
		
		List<EquipmentInfo> equipmentInfos = equipmentInfoRepository.findAll();
		for(EquipmentInfo equipmentInfo : equipmentInfos) {
			OperateLog operateLog = new OperateLog();
	    	operateLog.setCreateTime(new Date());
	    	operateLog.seteCmd(equipmentInfo.geteCmd());
	    	operateLog.seteId(equipmentInfo.geteId());
	    	operateLogRepository.save(operateLog);
		}
		
	}
	
}
