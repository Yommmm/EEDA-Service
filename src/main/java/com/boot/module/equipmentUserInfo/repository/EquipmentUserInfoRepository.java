package com.boot.module.equipmentUserInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.module.equipmentUserInfo.bean.EquipmentUserInfo;

@Repository
public interface EquipmentUserInfoRepository extends JpaRepository<EquipmentUserInfo, String> {
	
}
