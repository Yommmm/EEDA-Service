package com.boot.common.quartz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.boot.module.equipmentData.bean.EDataAvg;
import com.boot.module.equipmentData.bean.EquipmentData;
import com.boot.module.equipmentData.repository.EDataAvgRepository;
import com.boot.module.equipmentData.repository.EquipmentDataRepository;
import com.boot.module.equipmentInfo.repository.EquipmentInfoRepository;

@Component
public class DataStatJob {
	
	@Autowired
	private EquipmentDataRepository edRepository;
	
	@Autowired
	private EDataAvgRepository eDataAvgRepository;
	
	@Autowired
	private EquipmentInfoRepository eiRepository;

	@Scheduled(cron = "0 0/10 * * * ? ")
	@Transactional
	public void execute() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long execTimestamp = Calendar.getInstance().getTime().getTime();
		
		String end = sdf.format(execTimestamp - 600000L);
		Date endTime = sdf.parse(end);
		String start = sdf.format(execTimestamp - 1200000L);
		Date startTime = sdf.parse(start);
		
		List<String> eMacs = eiRepository.findAllEMac();
		for(String eMac : eMacs) {
			Map<String, Object> resultMap = edRepository.queryAvgLast10Min(eMac, end);
			List<EquipmentData> equipmentDatas = edRepository.queryLast10Min(eMac, end);
			if(null != equipmentDatas && !equipmentDatas.isEmpty()) {
				EDataAvg eDataAvg = new EDataAvg();
				eDataAvg.seteMac(eMac);
				eDataAvg.seteAvgHumidity(resultMap.get("e_humidity").toString());
				eDataAvg.seteAvgPressure(resultMap.get("e_pressure").toString());
				eDataAvg.seteAvgTemperature(resultMap.get("e_temperature").toString());
				eDataAvg.setStartTime(startTime);
				eDataAvg.setEndTime(endTime);
				eDataAvgRepository.save(eDataAvg);
				
				edRepository.deleteAll(equipmentDatas);
			}
		}
		
	}
	
}
