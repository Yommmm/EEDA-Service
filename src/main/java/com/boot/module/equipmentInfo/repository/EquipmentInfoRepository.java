package com.boot.module.equipmentInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.module.equipmentInfo.bean.EquipmentInfo;

@Repository
public interface EquipmentInfoRepository extends JpaRepository<EquipmentInfo, String> {
	
}
